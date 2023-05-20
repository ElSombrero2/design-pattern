package com.elsombrero.builder.items.burgers;

import com.elsombrero.builder.items.abstracts.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
