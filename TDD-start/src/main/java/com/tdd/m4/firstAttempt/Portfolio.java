package com.tdd.m4.firstAttempt;

import java.util.List;
import java.util.ArrayList;

public class Portfolio {
    List<Stock> stocks = new ArrayList<Stock>();

    public void printPortfolio() {
        stocks.forEach(System.out::println);
    }

    public void add(Stock symbol) {
        this.stocks.add(symbol);
    }

    public double totalValue() {
        if (this.stocks.isEmpty()) return 0;
        return this.stocks.stream().mapToDouble(Stock::totalValue).sum();
    }
}
