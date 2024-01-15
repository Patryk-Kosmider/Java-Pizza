package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PizzaITTests {
    // Wstrzykujemy to co chcemy testować
    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private PizzaStorage pizzaStorage;
    private Pizza pizza1 = new Pizza("Patryk", PizzaSize.MEDIUM, PizzaMenu.MARGHARITA);
    private Pizza pizza2 = new Pizza("Bartek", PizzaSize.BIG, PizzaMenu.CHEESE);

    @Test
    void getPizzaPrice() {
        double result = pizzaService.getPizzaPrice(PizzaMenu.MARGHARITA, PizzaSize.BIG);
        Assertions.assertEquals(60, result);
    }

    @Test
    void findPizzaByUserName() {

        pizzaStorage.addPizza(pizza1);
        pizzaStorage.addPizza(pizza2);

        Pizza pizzaRes = pizzaService.findPizzaByUserName("Bartek");

        Assertions.assertNotNull(pizzaRes);
        Assertions.assertEquals("Bartek", pizzaRes.getUsername());
        Assertions.assertEquals(PizzaSize.BIG, pizzaRes.getPizzaSize());
        Assertions.assertEquals(PizzaMenu.CHEESE, pizzaRes.getPizzaMenu());
    }
}
