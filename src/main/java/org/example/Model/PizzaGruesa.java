package org.example.Model;

import org.example.Interface.Pizza;

public class PizzaGruesa implements Pizza {
    @Override
    public void amasar() {
        System.out.println("Amasando pizza gruesa");
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando pizza Gruesa");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza Gruesa");
    }
}
