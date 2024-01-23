package com.tdd.m4.secondAttempt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("the class portfolio should")
public class PortfolioPositionTest {
    @Test
    @DisplayName("has 0 positions if is empty")
    public void emptyPortfolio_zeroPositions() {
        Portfolio portfolio = new Portfolio();

        assertEquals(0, portfolio.getAllPositions().size());
    }

    @Test
    @DisplayName("if it has only one position, return that position")
    public void portfolioWithOnePosition_ReturnsThatPosition() {
        Portfolio portfolio = new Portfolio();
        String symbol = "MSFT";

        portfolio.add(new Position(new Stock(symbol), 10, 260));

        assertEquals(1, portfolio.getAllPositions().size());
        assertEquals(10, portfolio.getPosition(symbol).getQty());
        assertEquals(260, portfolio.getPosition(symbol).getAveragePx());
        assertEquals(2600, portfolio.getPosition(symbol).getValue());
    }

    @Test
    @DisplayName("if it has 2 positions, return those positions")
    public void portfolioWithTwoPositions_ReturnsThosePositions() {
        Portfolio portfolio = new Portfolio();
        String microsoft = "MSFT";
        String apple = "AAPL";

        portfolio.add(new Position(new Stock(microsoft), 10, 260));
        portfolio.add(new Position(new Stock(apple), 2, 150));

        assertEquals(2, portfolio.getAllPositions().size());

        assertEquals(10, portfolio.getPosition(microsoft).getQty());
        assertEquals(260, portfolio.getPosition(microsoft).getAveragePx());
        assertEquals(2600, portfolio.getPosition(microsoft).getValue());

        assertEquals(2, portfolio.getPosition(apple).getQty());
        assertEquals(150, portfolio.getPosition(apple).getAveragePx());
        assertEquals(300, portfolio.getPosition(apple).getValue());
    }

    @Test
    @DisplayName("if it has 2 positions of the same stock, return one position")
    public void portfolioWithTwoPositionsOfTheSameStock_ReturnsThatPosition() {
        Portfolio portfolio = new Portfolio();
        String microsoft = "MSFT";

        portfolio.add(new Position(new Stock(microsoft), 10, 260));
        portfolio.add(new Position(new Stock(microsoft), 5, 2000));

        assertEquals(1, portfolio.getAllPositions().size());
    }

    @Test
    @DisplayName("if it has 2 positions of the same stock, return one position with right qty")
    public void portfolioWithTwoPositionsOfTheSameStock_ReturnsThatPositionWithRightQty() {
        Portfolio portfolio = new Portfolio();
        String microsoft = "MSFT";

        portfolio.add(new Position(new Stock(microsoft), 10, 260));
        portfolio.add(new Position(new Stock(microsoft), 5, 2000));

        assertEquals(15, portfolio.getPosition(microsoft).getQty());
    }

    @Test
    @DisplayName("if it has 2 positions of the same stock, return one position with right price")
    public void portfolioWithTwoPositionsOfTheSameStock_ReturnsThatPositionWithRightPrice() {
        Portfolio portfolio = new Portfolio();
        String microsoft = "MSFT";

        portfolio.add(new Position(new Stock(microsoft), 1, 240));
        portfolio.add(new Position(new Stock(microsoft), 1, 220));

        assertEquals(230, portfolio.getPosition(microsoft).getAveragePx());
    }

    @Test
    @DisplayName("if it has 2 positions of the same stock, return one position with right value")
    public void portfolioWithTwoPositionsOfTheSameStock_ReturnsThatPositionWithRightValue() {
        Portfolio portfolio = new Portfolio();
        String microsoft = "MSFT";

        portfolio.add(new Position(new Stock(microsoft), 2, 240));
        portfolio.add(new Position(new Stock(microsoft), 1, 220));

        double expected = 2 * 240 + 220;
        assertEquals(expected, portfolio.getPosition(microsoft).getValue());
    }

    @Test
    @DisplayName("return the correct total value for the portfolio")
    public void portfolioWithOneOrMorePosition_returnCorrectTotalValue() {
        Portfolio portfolio = new Portfolio();

        portfolio.add(new Position(new Stock("MSFT"), 1, 260));
        portfolio.add(new Position(new Stock("MSFT"), 2, 250));

        portfolio.add(new Position(new Stock("AAPL"), 5, 90));
        portfolio.add(new Position(new Stock("AAPL"), 10, 80));

        portfolio.add(new Position(new Stock("ORCL"), 100, 80));

        assertEquals(3, portfolio.getAllPositions().size());
        assertEquals(10010, portfolio.getTotalValue());
    }
}
