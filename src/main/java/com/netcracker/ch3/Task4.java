package com.netcracker.ch3;

import com.netcracker.ch3.interfaces.IntSequence;

public class Task4 {
        public static void main(String[] args) {
            IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
            while (sequence.hasNext()){
                System.out.println(sequence.next());
            }

        }
}

