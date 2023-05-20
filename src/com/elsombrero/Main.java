package com.elsombrero;

import com.elsombrero.strategy.entities.Apple;
import com.elsombrero.strategy.entities.Human;
import com.elsombrero.strategy.entities.Pineapple;

public class Main {
    public static void main(String[] args) {
        var human = new Human();
        human.eat(new Apple());
        human.eat(new Pineapple());
        human.eat(new Human());
        human.eat(human);
    }
}
