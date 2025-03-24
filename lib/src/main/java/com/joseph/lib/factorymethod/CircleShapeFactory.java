package com.joseph.lib.factorymethod;

public class CircleShapeFactory extends BaseShapeFactory{

    @Override
    IShape createShape() {
        return new Circle();
    }
}
