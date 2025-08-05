package com.oops.sahpeareacalulator;

public class Rectangle extends Shape {
   private double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

}
