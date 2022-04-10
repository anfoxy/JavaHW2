package com.netcracer.ch3;

import com.netcracer.ch3.interfaces.Measurable;

public class Task2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("t1", 15);
        Employee e2 = new Employee("t2", 10);
        Employee e3 = new Employee("t3", 20);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        Measurable[] objects = {e1, e2, e3};
        System.out.println("Employee with the largest salary is: " + ((Employee)largest(objects)));
        System.out.println();

        Employee e4 = new Employee("t1", 115);
        Employee e5 = new Employee("t2", 120);
        Employee e6 = new Employee("t3", 130);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        Measurable[] objects1 = {e4, e5, e6};
        System.out.println("Employee with the largest salary is: " + ((Employee)largest(objects1)));

    }

    public static Measurable largest(Measurable[] objects) {

        Measurable max = objects[0];
        for (Measurable measurable : objects) {
            if (max.getMeasure() <= measurable.getMeasure()) {
                max = measurable;
            }
        }
        return max;

    }
}
