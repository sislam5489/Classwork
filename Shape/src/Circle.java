
public class Circle implements Shape{
	private double radius;
	private static double PI = 3.14;
	public double perimeter()
	{
		return 2*PI*radius;
	}
	public double area()
	{
		return (PI*radius*radius);
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
}
