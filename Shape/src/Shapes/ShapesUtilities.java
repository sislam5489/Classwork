package Shapes;

import java.util.Random;

public class ShapesUtilities {

	public static double sumPeri(Shapes[] shapearr)
	{
		double sum = 0;
		for(int i =0;i<shapearr.length;i++)
		{
			sum+=shapearr[i].perimeter();
		}
		return sum;
		
	}
	public static double sumArea(Shapes[] shapearr)
	{
		double sum = 0;
		for(int i = 0;i<shapearr.length;i++)
		{
			sum+=shapearr[i].area();
		}
		return sum;
	}
	public static Shapes getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt();
		switch(x)
		{
		case 0:
			return new Circle(r.nextInt(100));
		case 1:
			return new Rectangle(r.nextInt(100),r.nextInt(101));
		default:
			return new Rectangle(5,4);
		}
	}
}
