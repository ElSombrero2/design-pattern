package com.elsombrero.factory;

import com.elsombrero.factory.abstracts.AbstractShapeFactory;
import com.elsombrero.factory.shapes.Rectangle;
import com.elsombrero.factory.shapes.Square;

public class RoundedShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape create(ShapeType shape) {
        switch (shape){
            case ROUNDED_RECTANGLE: return new Rectangle();
            case ROUNDED_SQUARE: return new Square();
        }
        return null;
    }

}
