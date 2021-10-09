package com.company;

abstract class Car {
    protected int topSpeed; // in km/h

    abstract void getTopSpeed();

    public void displayTopSpeed(){
        System.out.println("Top speed of this car is " + topSpeed + " km/h");
    }

}
