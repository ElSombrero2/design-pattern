package com.elsombrero.builder.items.abstracts;

import com.elsombrero.builder.Item;
import com.elsombrero.builder.Packing;
import com.elsombrero.builder.packs.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing pack() {
        return new Wrapper();
    }
}
