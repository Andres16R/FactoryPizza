package org.example.Model;

import org.example.Interface.Pizza;

public class PizzaDelgada implements Pizza {
    @Override
    public void amasar() {
        System.out.println("Amasando pizza delgada");
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando pizza delgada");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza delgada");
    }
}
