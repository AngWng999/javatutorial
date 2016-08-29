package javatutor;

public class ValidTriangle {

	public static void main(String[] args) {
		double side1 = 20;
		double side2 = 1;
		double side3 = 3;
		boolean valid = false;
		String result = "Invalid Triangle";
		if (side1>0 && side2>0 && side3>0)
		{
			if ((side1 + side2)>side3 && (side1 + side3)>side2 && (side2 + side3)>side1)
			{
				valid = true;
				
			} 

		} 
		if (valid)
		{
			result = "Valid Triangle";
		} 
		System.out.println(result);

	}
	
	

}
