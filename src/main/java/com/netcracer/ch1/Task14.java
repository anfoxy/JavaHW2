package com.netcracer.ch1;

public class Task14 {

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {2, 1, 1, 2},
                        {1, 2, 2, 1},
                        {1, 2, 2, 1},
                        {2, 1, 1, 2},

                };
        MagicSqaure m = new MagicSqaure(matrix);

        System.out.println(m);
        System.out.println("res " + m.сheckMagicSquare());

        int[][] matrix1 =
                {
                        {2, 1, 1, 2},
                        {1, 1, 1, 1},
                        {1, 2, 2, 1},
                        {2, 1, 1, 2},

                };
        MagicSqaure m1 = new MagicSqaure(matrix1);

        System.out.println(m1);
        System.out.println("res " + m1.сheckMagicSquare());

    }
}
