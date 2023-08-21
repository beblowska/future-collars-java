package task76.exchangeprovider;

import org.apache.http.HttpResponse;
import task76.Currency;
import task76.exchangeapi.ExchangeRateProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ExternalExchangeRateProvider implements ExchangeRateProvider {
    private static final String API_URL = "https://openexchangerates.org/api/latest.json";

    private HttpClient httpClient;

    private Map<Currency, Double> buyingRates;
    private Map<Currency, Double> sellingRates;

    public ExternalExchangeRateProvider() {
        this.httpClient = HttpClients.createDefault();
        this.buyingRates = new HashMap<>();
        this.sellingRates = new HashMap<>();
        fetchExchangeRates();
    }

    private void fetchExchangeRates() {
        try {
            HttpGet request = new HttpGet(API_URL);
            HttpResponse response = httpClient.execute(request);

            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuilder responseContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            JSONObject jsonResponse = new JSONObject(responseContent.toString());

            for (Currency currency : Currency.values()) {
                buyingRates.put(currency, jsonResponse.getJSONObject(currency.toString()).getDouble("buyingRate"));
                sellingRates.put(currency, jsonResponse.getJSONObject(currency.toString()).getDouble("sellingRate"));
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to fetch exchange rates.");
        }
    }

    @Override
    public double getBuyingRate(Currency currency) {
        return buyingRates.get(currency);
    }

    @Override
    public double getSellingRate(Currency currency) {
        return sellingRates.get(currency);
    }

    public double getBuyingExchangeRate(Currency currency) {
        return buyingRates.get(currency);
    }

    public double getSellingExchangeRate(Currency currency) {
        return sellingRates.get(currency);
    }
}
