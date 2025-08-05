package com.oops.sahpeareacalulator;

public class ShapeCalculator {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 6);
		Shape triangle = new Triangle(3, 8);

		circle.printType();
		System.out.println("Area: " + circle.getArea());

		rectangle.printType();
		System.out.println("Area: " + rectangle.getArea());

		triangle.printType();
		System.out.println("Area: " + triangle.getArea());
	}
}


