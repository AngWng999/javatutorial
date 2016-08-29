package javatutor;

public class TriangleType {

	public static void main(String[] args) {
		double side1 = 3;// none can be zero tho
		double side2 = 3;
		double side3 = 3;
		if ((side1 + side2)>side3 && (side1 + side3)>side2 && (side2 + side3)>side1 && (side1 > 0) && (side2 > 0) && (side3 > 0)) 
		{
			if ((side1 == side2) && (side1 == side3) && (side2 == side3))
			{
				System.out.println("Equilateral");
			} else if (side1 == side2 || side1 == side3 || side2 == side3) 
			{
				System.out.println("Isoceles");
			} else
			{
				System.out.println("Scalene");
			}
		} else
		{
			System.out.println("Invalid Triangle");
		}

	}
	

}

