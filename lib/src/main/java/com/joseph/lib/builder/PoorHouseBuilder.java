package com.joseph.lib.builder;

public class PoorHouseBuilder extends HouseBuilder{
    House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Stone Foundation");
        System.out.println("build poor foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Stone Walls");
        System.out.println("build poor walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Stone Roof");
        System.out.println("build poor roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Stone Interior");
        System.out.println("build poor interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
