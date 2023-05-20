package com.elsombrero.strategy.entities;

import com.elsombrero.strategy.Eatable;
import com.elsombrero.strategy.Entity;

public class Human implements Entity, Eatable {
    @Override
    public String name() {
        return "Human";
    }

    @Override
    public void eat(Eatable eatable) {
        eatable.eatenBy(this);
    }

    @Override
    public void eatenBy(Entity entity) {
        if(entity == this) System.out.println("He eats himself");
        else System.out.println("Human is cannibal");
    }
}
