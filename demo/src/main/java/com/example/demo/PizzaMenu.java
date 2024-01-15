package com.example.demo;

public enum PizzaMenu {
    MARGHARITA(30), CHEESE(35), SALAMI(40);

    private final double price;

    PizzaMenu(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
