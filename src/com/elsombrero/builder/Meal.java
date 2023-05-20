package com.elsombrero.builder;

import java.util.ArrayList;

public class Meal {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public float getCost(){
        var sum = 0;
        for(var i: items) sum += i.price();
        return sum;
    }

    public void show(){
        for(var i: items)
            System.out.println(String.format("Item: %s, Packing: %s, Price: %f ", i.name(), i.pack(), i.price()));
    }

}
