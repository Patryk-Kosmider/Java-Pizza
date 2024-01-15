package com.example.demo;

public enum PizzaSize {

    SMALL(1), MEDIUM(1.5), BIG(2);

    private final double multiplier;

    PizzaSize(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
