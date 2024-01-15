package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

@ExtendWith(MockitoExtension.class)
public class PizzaServiceTest {

    @Mock
    private PizzaMenu pizzaMenu;
    @Mock
    private PizzaSize pizzaSize;
    @Mock
    private PizzaStorage pizzaStorage;

    //Mocki wstrzykujemy do pizzaService
    @InjectMocks
    private PizzaService pizzaService;

    @Test
    void getPizzaPrice() {

        // Ustalamy co sie wydarzy gdy wywolane beda metody z mockow
        Mockito.when(pizzaMenu.getPrice()).thenReturn(40.0);
        Mockito.when(pizzaSize.getMultiplier()).thenReturn(1.5);

       pizzaService = new PizzaService(null);

       double result = pizzaService.getPizzaPrice(pizzaMenu, pizzaSize);
        Assertions.assertEquals(60, result);
    }

    @Test
    void findPizzaByUserName() {
        Mockito.when(pizzaStorage.getPizzaList()).thenReturn(List.of(new Pizza("Patryk", PizzaSize.MEDIUM, PizzaMenu.SALAMI), new Pizza("Bartek", PizzaSize.SMALL, PizzaMenu.MARGHARITA)));

        Pizza pizza = pizzaService.findPizzaByUserName("Patryk");

        Assertions.assertNotNull(pizza);
        Assertions.assertEquals("Patryk", pizza.getUsername());
        Assertions.assertEquals(PizzaSize.MEDIUM, pizza.getPizzaSize());
        Assertions.assertEquals(PizzaMenu.SALAMI, pizza.getPizzaMenu());
    }
}
