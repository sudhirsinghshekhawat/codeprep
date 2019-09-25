package com.designpattern.factory;

import java.util.function.Supplier;

public class FactoryDemoPattern
{
    public static void main(String[] args) {

        Supplier<ShapeFactory> shapeFactory = ShapeFactory::new;
        shapeFactory.get().getShape("CIRCLE").draw();

//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//        shape1.draw();
    }
}
