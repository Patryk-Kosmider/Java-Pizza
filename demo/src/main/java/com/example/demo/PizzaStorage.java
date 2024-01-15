package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class PizzaStorage {

    private List<Pizza> pizzaList;

    public PizzaStorage(List<Pizza> pizza) {
        this.pizzaList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }
}
