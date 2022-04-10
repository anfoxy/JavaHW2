package com.netcracker.ch2;

public class Task9 {
    public static void main(String[] args) {

        Car car1 = new Car(40.0f, 1.0f);

        System.out.println("car  =          "+car1);
        System.out.println("the car moves 40 miles");
        car1.drive(40.0f);
        System.out.println("car  =          "+car1);
        System.out.println("the car moves 1 miles");
        car1.drive(1.0f);
        System.out.println("car  =          "+car1);
        System.out.println("100 gallons of fuel were added to the car");
        car1.addGallons(100.0f);
        System.out.println("car  =          "+car1);
        System.out.println("the car moves 100 miles");
        car1.drive(100.0f);
        System.out.println("car  =          "+car1);
        System.out.println("the car moves 1 miles");
        car1.drive(1.0f);
        System.out.println("car  =          "+car1);

    }
}
