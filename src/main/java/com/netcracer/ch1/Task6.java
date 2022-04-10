package com.netcracer.ch1;

import java.math.BigInteger;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("factorial 23 =  "+factorial(23));
        System.out.println("correct answer: 25852016738884976640000");
        System.out.println("factorial 5 =   "+factorial(5));
        System.out.println("correct answer: 120");
        System.out.println("factorial 15 =  "+factorial(15));
        System.out.println("correct answer: 1307674368000");
        System.out.println("factorial 40 =  "+factorial(40));
        System.out.println("correct answer: 815915283247897734345611269596115894272000000000");
        System.out.println("factorial 50 =  "+factorial(50));
        System.out.println("correct answer: 30414093201713378043612608166064768844377641568960512000000000000");

    }
    public static BigInteger factorial(int n){
        BigInteger res = new BigInteger("1");
        for (int i =1;i<=n;i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
