package com.joseph.lib.factorymethod;

public class RectangleShapeFactory extends BaseShapeFactory{
    @Override
    IShape createShape() {
        return new Rectangle();
    }
}
