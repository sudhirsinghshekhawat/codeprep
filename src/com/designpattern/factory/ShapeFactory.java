package com.designpattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory
{

    final static Map<String, Supplier<Shape>> map = new HashMap<>();

    static {
        map.put("CIRCLE",Circle::new);
        map.put("Rectangle",Rectangle::new);
    }


    public Shape getShape(String shapeType) {
       Supplier<Shape> shape = map.get(shapeType.toUpperCase());

       if (shape!=null)
           return  shape.get();

       throw  new IllegalArgumentException("No Such type of shape exist");

    }

    //old way
//    public Shape getShape(String shapeType) {
//        if (shapeType == null)
//            return null;
//
//        if (shapeType.equalsIgnoreCase("CIRCLE"))
//            return new Circle();
//        else if (shapeType.equalsIgnoreCase("Rectangle"))
//            return new Rectangle();
//        else
//            return null;
//    }
}
