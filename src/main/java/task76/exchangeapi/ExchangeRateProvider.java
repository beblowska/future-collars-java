package task76.exchangeapi;

import task76.Currency;

public interface ExchangeRateProvider {
    double getBuyingRate(Currency currency);
    double getSellingRate(Currency currency);

    double getBuyingExchangeRate(Currency currency);

    double getSellingExchangeRate(Currency currency);
}
