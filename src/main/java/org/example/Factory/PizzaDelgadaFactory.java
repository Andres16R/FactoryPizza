package org.example.Factory;

import org.example.Interface.Pizza;
import org.example.Model.PizzaDelgada;

public class PizzaDelgadaFactory extends PizzeriaFactory{
    @Override
    public Pizza hacerPizza() {
        return new PizzaDelgada();
    }
}
