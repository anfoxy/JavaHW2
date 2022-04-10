package com.netcracker.ch1;

import java.util.ArrayList;
import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        lotteryComb();
        System.out.println("===============================");
        lotteryComb();
        System.out.println("===============================");
        lotteryComb();
    }
    private static void lotteryComb() {
        int len = 49;
        ArrayList<Integer> lot = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            lot.add(i);
        }
        Random random = new Random();
        for (int n = 0; n < 6; n++) {
            System.out.println("lottery combination N° " + n);
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(lot.size());
                int value = lot.remove(index);
                res.add(value);
            }
            System.out.println(res);
        }
    }
}
