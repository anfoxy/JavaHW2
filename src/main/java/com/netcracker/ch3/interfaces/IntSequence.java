package com.netcracker.ch3.interfaces;



import java.util.Arrays;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int... values) {
            return new IntSequence() {

                int[] m = Arrays.copyOf(values, values.length);
                int n=0;

                @Override
                public int next() {
                        return m[n++];
                }
                @Override
                public boolean hasNext() {
                    return n < m.length;
                }
            };
    }



    static IntSequence constant(int i) {
        return new IntSequence() {
            @Override
            public int next() {
                return value;
            }

            @Override
            public boolean hasNext() {
                return true;
            }

            final int value = i;

        };
    }

}