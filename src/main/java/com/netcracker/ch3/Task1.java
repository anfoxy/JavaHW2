package com.netcracker.ch3;

import com.netcracker.ch3.interfaces.Measurable;



public class Task1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("t1", 15);
        Employee e2 = new Employee("t2", 10);
        Employee e3 = new Employee("t3", 20);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        Measurable[] objects = {e1, e2, e3};
        System.out.println("The average salary is: " + average(objects));
        System.out.println();

        Employee e4 = new Employee("t4", 25);
        Employee e5 = new Employee("t5", 35);
        Employee e6 = new Employee("t6", 42);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        Measurable[] objects1 = {e4, e5, e6};
        System.out.println("The average salary is: " + average(objects1));

    }

    public static double average(Measurable[] objects) {

        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / (double) objects.length;
    }

}
