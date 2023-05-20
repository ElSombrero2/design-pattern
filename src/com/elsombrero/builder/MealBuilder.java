package com.elsombrero.builder;

import com.elsombrero.builder.items.burgers.ChickenBurger;
import com.elsombrero.builder.items.burgers.VeganBurger;
import com.elsombrero.builder.items.drinks.Cola;
import com.elsombrero.builder.items.drinks.Soda;

public class MealBuilder {

    public Meal prepareVeganMeal(){
        var meal = new Meal();
        meal.addItem(new VeganBurger());
        meal.addItem(new Soda());
        return meal;
    }

    public Meal prepareChickenMeal(){
        var meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Cola());
        return meal;
    }

}
