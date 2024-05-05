package org.example.Factory;

import org.example.Interface.Pizza;
import org.example.Model.PizzaIntegral;

public class PizzaIntegralFactory extends PizzeriaFactory{
    @Override
    public Pizza hacerPizza() {
        return new PizzaIntegral();
    }
}
