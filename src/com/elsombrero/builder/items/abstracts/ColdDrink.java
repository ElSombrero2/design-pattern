package com.elsombrero.builder.items.abstracts;

import com.elsombrero.builder.Item;
import com.elsombrero.builder.Packing;
import com.elsombrero.builder.packs.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }
}
