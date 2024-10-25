package main;

import java.lang.Math;

public class Triangle {
	public int side1, side2, side3;
	
	public Triangle(int side1, int side2, int side3) throws Exception{
		
		if (side1 < 0 || side2 < 0 || side3 < 0)
			throw new Exception("all sides have to be positive");
		
		if ((side1 + side2) <= side3)
			throw new Exception("side 3 needs to be greater than side 1 and side 2");
		
		if ((side1 + side3) <= side2)
			throw new Exception("side 2 needs to be greater than side 1 and side 3");
		
		if ((side2 + side3) <= side1)
			throw new Exception("side 1 needs to be greater than side 2 and side 3");
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;		
		
	}
	
	public double calculateArea() {
		double s = (this.side1 + this.side2 + this.side3) * 0.5;
		System.out.println("\t s=" + s);
		double calculation = s * (s - side1) * (s - side2) * (s - side3);
		double result = Math.sqrt(calculation);
		System.out.println("\t result=" + result);	

		return result;
	}
}