package com.elsombrero.factory.abstracts;

import com.elsombrero.factory.Shape;
import com.elsombrero.factory.ShapeType;

public abstract class AbstractShapeFactory {
    public abstract Shape create(ShapeType shape);
}
