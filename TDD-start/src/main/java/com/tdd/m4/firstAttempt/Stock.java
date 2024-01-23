package com.tdd.m4.firstAttempt;

public class Stock {
    private String symbol;
    private int qty;
    private double px;

    public Stock(String symbol, int qty, double px) {
        this.symbol = symbol;
        this.qty = qty;
        this.px = px;
    }

    public double totalValue() {
        return this.qty * this.px;
    }

    @Override
    public String toString() {
        return String.format("{ %s | Qty: %s | Px: %s | Value %s }", this.symbol, this.qty, this.px, this.qty * this.px);
    }
}
