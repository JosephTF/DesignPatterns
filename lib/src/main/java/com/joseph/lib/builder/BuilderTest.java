package com.joseph.lib.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director(new PoorHouseBuilder());
        House house = director.getHouse();
        System.out.println(house);

        director = new Director(new LuxuryHouseBuilder());
        house = director.getHouse();
        System.out.println(house);
    }
}
