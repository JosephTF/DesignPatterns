package com.joseph.lib.builder;

public class LuxuryHouseBuilder extends HouseBuilder{
    House house = new House();
    @Override
    public void buildFoundation() {
        house.setFoundation("Gold Foundation");
        System.out.println("build luxury foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Gold Walls");
        System.out.println("build luxury walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Gold Roof");
        System.out.println("build luxury roof");
    }

    @Override
    public void buildInterior()
    {
        house.setInterior("Gold Interior");
        System.out.println("build luxury interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
