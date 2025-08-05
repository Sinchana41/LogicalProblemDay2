package com.oops.sahpeareacalulator;

public class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    } 

}
