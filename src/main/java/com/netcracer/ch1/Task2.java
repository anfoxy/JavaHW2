package com.netcracer.ch1;
//2,6,8,13,14
public class Task2 {

    public static void main(String[] args) {

        System.out.println("normalize value angle(450) = "+normalizeValue(450));
        System.out.println("correct answer:              90");
        System.out.println("normalize value angle(45) = "+normalizeValue(45));
        System.out.println("correct answer:             45");
        System.out.println("normalize value angle(370) = "+normalizeValue(370));
        System.out.println("correct answer:              10");
        System.out.println("normalize value angle(720) = "+normalizeValue(720));
        System.out.println("correct answer:              0");

        System.out.println("normalize value using FloorMod angle(450) = "+normalizeValueUsingFloorMod(450));
        System.out.println("correct answer:                             90");
        System.out.println("normalize value using FloorMod angle(45) = "+normalizeValueUsingFloorMod(45));
        System.out.println("correct answer:                            45");
        System.out.println("normalize value using FloorMod angle(370) = "+normalizeValueUsingFloorMod(370));
        System.out.println("correct answer:                             10");
        System.out.println("normalize value using FloorMod angle(720) = "+normalizeValueUsingFloorMod(720));
        System.out.println("correct answer:                             0");

    }
    public static Integer normalizeValue(Integer angle){
        return angle = (angle +360) % 360;
    }

    public static Integer normalizeValueUsingFloorMod(Integer angle){
        return  Math.floorMod(angle,360);
    }
}
