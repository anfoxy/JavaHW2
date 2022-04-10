package com.netcracer.ch2;

public class Point {
   private double x;
   private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(int x, int y) {

        return new Point(this.x + x, this.y + y );
    }

    public Point scale(double scale) {

        return new Point(this.x * scale, this.y * scale);
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
