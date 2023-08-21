package task76;

import task76.exchangeprovider.ExternalExchangeRateProvider;

public class Main {
    public static void main(String[] args) {
        ExternalExchangeRateProvider exchangeRateProvider = new ExternalExchangeRateProvider();
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateProvider);

        double amountPLN = 1000.0;
        double convertedAmountUSD = currencyCalculator.convertToCurrency(amountPLN, Currency.PLN, Currency.USD);
        double convertedAmountEUR = currencyCalculator.convertToCurrency(amountPLN, Currency.PLN, Currency.EUR);
        double convertedAmountGBP = currencyCalculator.convertToCurrency(amountPLN, Currency.PLN, Currency.GBP);

        System.out.println("Converted amount in USD: " + convertedAmountUSD);
        System.out.println("Converted amount in EUR: " + convertedAmountEUR);
        System.out.println("Converted amount in GBP: " + convertedAmountGBP);
    }
}
