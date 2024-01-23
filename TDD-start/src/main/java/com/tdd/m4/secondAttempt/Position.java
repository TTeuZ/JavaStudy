package com.tdd.m4.secondAttempt;

public class Position {
    Stock stock;
    int qty;
    double averagePx;

    public Position(Stock stock, int qty, double averagePx) {
        this.stock = stock;
        this.qty = qty;
        this.averagePx = averagePx;
    }

    public void setStock(Stock stock) { this.stock = stock; }

    public void setQty(int qty) { this.qty = qty; }

    public void setAveragePx(double averagePx) { this.averagePx = averagePx; }

    public Stock getStock() { return stock; }

    public int getQty() { return this.qty; }

    public double getAveragePx() { return this.averagePx; }

    public double getValue() { return this.qty * this.averagePx; }

    @Override
    public String toString() {
        return String.format("{ %s | Qty: %s | Px: %s | Value %s }", this.stock, this.qty, this.averagePx, this.qty * this.averagePx);
    }
}
