package com.netcracker.ch1;

public class MagicSqaure {
    private int[][] matrix;

    public MagicSqaure(int[][] matrix) {
        this.matrix = matrix;
    }



    private Boolean checkRow () {
        int globalsumm;
        boolean r = true;
        int sum=0;
        for (int row=0; row<matrix.length; row++) {
            globalsumm = sum;
            sum=0;
            for (int col=0; col< matrix[0].length; col++) {
                sum += matrix[row][col];
            }
            if ( row>0 && (sum != globalsumm)) {
                r = false;
            }
        }
        return r;
    }

    private Boolean checkCol () {
        int globalsumm;
        boolean r = true;
        int sum=0;
        for (int col=0; col< matrix[0].length; col++) {
            globalsumm = sum;
            sum=0;
            for (int row=0; row<matrix.length; row++) {
                sum += matrix[row][col];
            }
            if ( col>0 && (sum != globalsumm)) {
                r = false;
            }
        }
        return r;
    }


    public Boolean checkDig () {
        int sum1=0;
        int sum2=0;
        for (int col=0; col < matrix[0].length; col++)
        {
            sum1 += matrix[col][matrix[0].length-col-1];
            sum2 += matrix[col][col];
        }
        return sum1==sum2;
    }



    public boolean сheckMagicSquare ()
    {
        return checkCol()&&checkRow()&&checkDig();
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("MagicSqaure =\n");

        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col< matrix[0].length; col++) {
                s.append(matrix[row][col]).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
