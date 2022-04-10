package com.netcracer.ch2;

import java.io.FileReader;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) throws Exception
    {
        au.com.bytecode.opencsv.CSVReader reader = new au.com.bytecode.opencsv.CSVReader(new FileReader("data.csv"), ',' , '"' , 1);
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}
