package Shapes;

public class Circle implements Shapes {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		// to be implemented by student
	}

	@Override
	public double area() {
		// to be implemented by student
		return pi*radius*radius;
	}

	@Override
	public double perimeter() {
		// to be implemented by student
		return pi*radius*2;
	}

	@Override
	public String toString() {
		// to be implemented by student
		return "Circle radius: " + radius +  " Area: " + this.area() + " Perimeter: "
		+ this.perimeter();
	}
}
