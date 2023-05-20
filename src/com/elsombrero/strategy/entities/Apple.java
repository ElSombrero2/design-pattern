package com.elsombrero.strategy.entities;

import com.elsombrero.strategy.Eatable;
import com.elsombrero.strategy.Entity;

public class Apple implements Eatable {
    @Override
    public void eatenBy(Entity entity) {
        System.out.println(entity.name() + " Eats Apple" );
    }
}
