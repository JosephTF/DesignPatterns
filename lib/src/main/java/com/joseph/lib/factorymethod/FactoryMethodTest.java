package com.joseph.lib.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        BaseShapeFactory factory = new CircleShapeFactory();
        IShape shape = factory.createShape();
        shape.draw();
        BaseShapeFactory factory2 = new RectangleShapeFactory();
        IShape shape2 = factory2.createShape();
        shape2.draw();
    }
}
