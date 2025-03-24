package com.joseph.lib.builder;

public class Director {
    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    private void constructHouse() {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildInterior();
    }

    public House getHouse() {
        if (builder == null) {
            return null;
        }
        constructHouse();
        return builder.getHouse();
    }
}
