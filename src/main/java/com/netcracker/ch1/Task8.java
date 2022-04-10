package com.netcracker.ch1;

public class Task8 {

    public static void main(String[] args) {

        substrings("1 2 123 12 123 1");
        System.out.println("correct answer:\n"+"1\n" + "2\n" + "123\n" + "12\n" + "123\n" + "1");

    }
    private static void substrings(String str) {
        String res = "";
        str+=" ";
        for (int start = 0; start < str.length(); start++) {
            if(str.charAt(start)== ' ') {
                if(res!="") System.out.println(res);
                res = "";
            } else {
                res = res + str.charAt(start);
            }
        }
    }
}
