package com.company;

public class Main {

    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        //get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rounded Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        //get an object of Shape Rounded Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
