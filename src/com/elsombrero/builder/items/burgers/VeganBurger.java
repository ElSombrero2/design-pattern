package com.elsombrero.builder.items.burgers;

import com.elsombrero.builder.items.abstracts.Burger;

public class VeganBurger extends Burger {

    @Override
    public String name() {
        return "Vegan Burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }

}
