package com.tdd.m4.secondAttempt;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio {
    Map<String, Position> positions;

    public Portfolio() {
        this.positions = new HashMap<>();
    }

    public void add(Position position) {
        String symbol = position.getStock().symbol();
        if (this.positions.containsKey(symbol)) {
            Position existingPosition = this.positions.get(symbol);

            int newQty = existingPosition.getQty() + position.getQty();
            double newAveragePx = (existingPosition.getQty() * existingPosition.getAveragePx() + position.getQty() * position.getAveragePx()) / newQty;

            existingPosition.setQty(newQty);
            existingPosition.setAveragePx(newAveragePx);
        } else
            this.positions.put(symbol, position);
    }

    public Position getPosition(String symbol) {
        return this.positions.get(symbol);
    }

    public Map<String, Position> getAllPositions() {
        return this.positions;
    }

    public double getTotalValue() {
        return this.positions.values().stream().mapToDouble(Position::getValue).sum();
    }

    public void print() {
        positions.values().forEach(System.out::println);

        System.out.println("==========================");
        System.out.println(this.getTotalValue());
    }
}
