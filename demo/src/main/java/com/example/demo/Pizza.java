package com.example.demo;

public class Pizza {
    private String username;
    private PizzaSize pizzaSize;
    private PizzaMenu pizzaMenu;

    public Pizza(String username, PizzaSize pizzaSize, PizzaMenu pizzaMenu) {
        this.username = username;
        this.pizzaSize = pizzaSize;
        this.pizzaMenu = pizzaMenu;
    }

    public String getUsername() {
        return username;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public PizzaMenu getPizzaMenu() {
        return pizzaMenu;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setPizzaMenu(PizzaMenu pizzaMenu) {
        this.pizzaMenu = pizzaMenu;
    }
}
