package com.elsombrero.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> cache = new Hashtable<>();

    public static void cache(String id, Shape shape){
        cache.put(id, shape);
    }

    public static Shape getShape(String id) throws CloneNotSupportedException {
        return (Shape) cache.get(id).clone();
    }

}
