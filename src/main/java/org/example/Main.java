package org.example;

import org.example.Factory.PizzaDelgadaFactory;
import org.example.Factory.PizzaGruesaFactory;
import org.example.Factory.PizzaIntegralFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡HACIENDO PIZZAS!\n");

        System.out.println("Haciendo Pizza Delgada");
        PizzaDelgadaFactory pizzaDelgadaFactory = new PizzaDelgadaFactory();
        pizzaDelgadaFactory.hacerPizza().amasar();
        pizzaDelgadaFactory.hacerPizza().moldear();
        pizzaDelgadaFactory.hacerPizza().hornear();
        System.out.println("Pizza Delgada Terminada!\n");

        System.out.println("Haciendo Pizza Gruesa");
        PizzaGruesaFactory pizzaGruesaFactory = new PizzaGruesaFactory();
        pizzaGruesaFactory.hacerPizza().amasar();
        pizzaGruesaFactory.hacerPizza().moldear();
        pizzaGruesaFactory.hacerPizza().hornear();
        System.out.println("Pizza Grueza Terminada!\n");

        System.out.println("Haciendo Pizza Integral");
        PizzaIntegralFactory pizzaIntegralFactory = new PizzaIntegralFactory();
        pizzaIntegralFactory.hacerPizza().amasar();
        pizzaIntegralFactory.hacerPizza().moldear();
        pizzaIntegralFactory.hacerPizza().hornear();
        System.out.println("Pizza Integral Terminada!");


    }
}