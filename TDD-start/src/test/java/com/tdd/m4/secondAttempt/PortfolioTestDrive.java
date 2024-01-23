package com.tdd.m4.secondAttempt;

public class PortfolioTestDrive {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        portfolio.add(new Position(new Stock("MSFT"), 1, 260));
        portfolio.add(new Position(new Stock("MSFT"), 2, 250));
        portfolio.add(new Position(new Stock("AAPL"), 5, 90));
        portfolio.add(new Position(new Stock("AAPL"), 10, 80));
        portfolio.add(new Position(new Stock("ORCL"), 100, 80));

        portfolio.print();
    }
}
