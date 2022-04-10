package com.netcracer.ch2;

public class Task5 {
    public static void main(String[] args) {

        Point point = new Point(5,5);
        System.out.println("Point  =        "+point);
        System.out.println("correct answer: x=5.0, y=5.0");

        System.out.println("translate point (3,6) = "+point.translate(3,6));
        System.out.println("correct answer:         x=8.0, y=11.0");

        System.out.println("scale point (3.5) = "+point.scale(3.5));
        System.out.println("correct answer:     x=17.5, y=17.5");


        Point point1 = new Point(1.4,5);
        System.out.println("Point1 =        "+point1);
        System.out.println("correct answer: x=1.4, y=5.0");

        System.out.println("translate point1 (2,3) = "+point1.translate(2,3));
        System.out.println("correct answer:          x=3.4, y=8.0");

        System.out.println("scale point1 (0.5) = "+point1.scale(0.5));
        System.out.println("correct answer:      x=0.7, y=2.5");

    }
}
