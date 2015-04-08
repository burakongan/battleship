package com.koyne;

import com.koyne.ships.TestShip;

public class Main {

    public static void main(String[] args) {
        TestShip testShip = new TestShip();
        testShip.setName("Test Ship");
        testShip.setPower(4);
        //
        System.out.println(testShip.getName() + ": " + testShip.getPower().toString());
    }
}
