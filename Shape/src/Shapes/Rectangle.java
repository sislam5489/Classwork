package Shapes;

public class Rectangle implements Shapes {

	private double length;
	private double width;

	public Rectangle(double side, double side2) {
		this.length = side;
		this.width = side2;
	}


	public double area() {
		// To be written by student
		return length*width;
	}


	public double perimeter() {
		// To be written by student
		return 2*length+2*width;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.area() + " Perimeter: "
				+ this.perimeter();
	}
}