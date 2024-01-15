package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    private PizzaStorage pizzaStorage;

    public PizzaService(PizzaStorage pizzaStorage) {
        this.pizzaStorage = pizzaStorage;
    }

    public double getPizzaPrice(PizzaMenu pizzaMenu, PizzaSize pizzaSize) {
        double price = pizzaMenu.getPrice() * pizzaSize.getMultiplier();
        return price;
    }

    public Pizza findPizzaByUserName(String username){
        for (Pizza pizza : pizzaStorage.getPizzaList()){
            if(pizza.getUsername().equals(username)){
                return pizza;
            }
        }
        return null;

    }


}
