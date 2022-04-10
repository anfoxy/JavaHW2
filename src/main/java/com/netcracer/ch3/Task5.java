package com.netcracer.ch3;

import com.netcracer.ch3.interfaces.IntSequence;



public class Task5 {
    public static void main(String[] args) {
        print(7, IntSequence.constant(1));
        System.out.println("==========");
        printL(10, () -> System.out.println(1));

    }

    public static void printL(int n, Runnable action) {
        for (int i = 0; i < n; i++) action.run();
    }

    private static void print(int n, IntSequence sequence) {
        for (int i = 0; i < n; i++)
            System.out.println(sequence.next());
    }
}

