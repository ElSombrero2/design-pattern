package com.elsombrero.singleton;

public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance == null) instance = new SingleObject();
        return instance;
    }

}
