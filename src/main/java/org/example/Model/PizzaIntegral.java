package org.example.Model;

import org.example.Interface.Pizza;

public class PizzaIntegral implements Pizza {
    @Override
    public void amasar() {
        System.out.println("Amasando pizza integral");
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando pizza integral");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza integral");
    }
}
