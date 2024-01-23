package com.tdd.m4.firstAttempt;

import com.tdd.m4.firstAttempt.Portfolio;
import com.tdd.m4.firstAttempt.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("The class Portfolio should")
public class PortfolioTest {
    @Test
    @DisplayName("Return total value equal 0 if it's empty")
    public void emptyPortifolio_hasZeroValue() {
        Portfolio portfolio = new Portfolio();

        assertEquals(0, portfolio.totalValue());
    }

    @Test
    @DisplayName("return the correct total value if ha one stocks")
    public void portfolioHaOneStock_CalculetesTotalValue() {
        int qty = 10;
        double px = 260;
        double value = qty * px;

        Portfolio portfolio = new Portfolio();
        portfolio.add(new Stock("MSFT", qty, px));

        assertEquals(value, portfolio.totalValue());
    }

    @Test
    @DisplayName("return the correct total value if has one or more stocks")
    public void portfolioHasStocks_CalculetesTotalValue() {
        int microsoftQty = 10;
        double microsoftyPx = 260;
        double microsoftValue = microsoftQty * microsoftyPx;

        int appleQty = 1;
        double applePx = 150;
        double appleValue = appleQty * applePx;

        Portfolio portfolio = new Portfolio();
        portfolio.add(new Stock("MSFT", microsoftQty, microsoftyPx));
        portfolio.add(new Stock("AAPL", appleQty, applePx));

        assertEquals(microsoftValue + appleValue, portfolio.totalValue());
    }

    @Test
    @DisplayName("return the correct total value if has more of the same stock")
    public void portfolioWithSameStockAddedWithDifferentPrices_CalculateTotalValue() {
        int appleQty_1 = 1;
        double applePx_1 = 150;
        double appleValue_1 = appleQty_1 * applePx_1;

        int appleQty_2 = 2;
        double applePx_2 = 100;
        double appleValue_2 = appleQty_2 * applePx_2;

        Portfolio portfolio = new Portfolio();
        portfolio.add(new Stock("AAPL", appleQty_1, applePx_1));
        portfolio.add(new Stock("AAPL", appleQty_2, applePx_2));

        assertEquals(appleValue_1 + appleValue_2, portfolio.totalValue());
    }
}
