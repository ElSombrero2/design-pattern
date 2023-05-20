package com.elsombrero.builder.items.drinks;

import com.elsombrero.builder.items.abstracts.ColdDrink;

public class Soda extends ColdDrink {

    @Override
    public String name() {
        return "Soda";
    }

    @Override
    public float price() {
        return 5.0f;
    }

}
