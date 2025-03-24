package com.joseph.lib.builder;

public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildFoundation();
    public abstract void buildWalls();
    public abstract void buildRoof();
    public abstract void buildInterior();
    public House getHouse() {
        return house;
    }
}
