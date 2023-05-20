package com.elsombrero.builder.items.drinks;

import com.elsombrero.builder.items.abstracts.ColdDrink;

public class Cola extends ColdDrink {

    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
