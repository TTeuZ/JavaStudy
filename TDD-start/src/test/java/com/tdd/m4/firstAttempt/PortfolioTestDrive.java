package com.tdd.m4.firstAttempt;

import com.tdd.m4.firstAttempt.Portfolio;
import com.tdd.m4.firstAttempt.Stock;

public class PortfolioTestDrive {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        portfolio.add(new Stock("AAPL", 1, 140));
        portfolio.add(new Stock("AAPL", 1, 120));
        portfolio.add(new Stock("MSFT", 1, 200));

        portfolio.printPortfolio();

        System.out.println("===============================");
        System.out.println(portfolio.totalValue());
    }
}
