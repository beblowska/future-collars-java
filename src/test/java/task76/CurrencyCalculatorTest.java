package task76;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import task76.exchangeapi.ExchangeRateProvider;

public class CurrencyCalculatorTest {
    private ExchangeRateProvider mockRateProvider;
    private CurrencyCalculator calculator;

    @BeforeEach
    void setUp() {
        mockRateProvider = mock(ExchangeRateProvider.class);
        calculator = new CurrencyCalculator(mockRateProvider);
    }

    @Test
    void testConvertToCurrency() {
        when(mockRateProvider.getBuyingExchangeRate(Currency.USD)).thenReturn(3.85);
        when(mockRateProvider.getSellingExchangeRate(Currency.PLN)).thenReturn(4.0);

        double convertedAmount = calculator.convertToCurrency(100, Currency.PLN, Currency.USD);

        assertEquals(96.25, convertedAmount, 0.01);
    }
}

