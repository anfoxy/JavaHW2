package com.netcracker.ch2;

public class Car {

    private float x;
    private float fuelEfficiency;
    private float fuelLevel=100;

    public Car(float fuelLevel, float fuelEfficiency){
        this.x = 0;
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(float x) {
        if(x<0){
            System.out.println("the distance cannot be less than zero");
            return;
        }
        if (fuelLevel <= 0)
        {
            System.out.println("no fuel");
            return;
        }
        this.x += x;
        this.fuelLevel -= x*fuelEfficiency;
    }

    public void addGallons(float gal)
    {
        this.fuelLevel += gal;
        if (fuelLevel >= 100)
            fuelLevel = 100;
    }

    public float getDistance()
    {
        return Math.abs(this.x);
    }

    public float getFuelLevel()
    {
        return this.fuelLevel;
    }

    @Override
    public String toString() {
        return "x= " + x +
                ", fuelEfficiency= " + fuelEfficiency +
                ", fuelLevel= " + fuelLevel;
    }
}
