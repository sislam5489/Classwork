package Shapes;

public class Rectangle implements Shapes {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		// To be written by student
		return 0.0;
	}


	public double calculatePerimeter() {
		// To be written by student
		return 0.0;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}