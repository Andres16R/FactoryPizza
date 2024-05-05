package org.example.Factory;

import org.example.Interface.Pizza;
import org.example.Model.PizzaGruesa;

public class PizzaGruesaFactory extends PizzeriaFactory{
    @Override
    public Pizza hacerPizza() {
        return new PizzaGruesa();
    }
}
