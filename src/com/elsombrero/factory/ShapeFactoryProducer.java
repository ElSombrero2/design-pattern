package com.elsombrero.factory;

import com.elsombrero.factory.abstracts.AbstractShapeFactory;

public class ShapeFactoryProducer {

    public AbstractShapeFactory createFactory(boolean rounded){
        if(rounded) return new RoundedShapeFactory();
        return new ShapeFactory();
    }

}
