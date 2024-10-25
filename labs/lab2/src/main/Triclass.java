package main;

public class Triclass {
	
	public static String classify(int s1, int s2, int s3) {
		
		if ((s1 < 1 || s1 > 10) || (s2 < 1 || s2 > 10) || (s3 < 1 || s3 > 10)) {  // If any of the sides given is not between 1 and 10
			System.out.println("Invalid");
			return "invalid";
		}
		else if (((s1 + s2) > s3) && ((s1 + s3) > s2) && ((s2 + s3) > s1)) {  // Checking if all sides are valid
			if ((s1 == s2) && (s1 == s3) && (s2 == s3)) {
				System.out.println("Equilateral");
				return "equilateral";
			}
			
			else if ((s1 != s2) && (s1 != s3) && (s2 != s3)) {
				System.out.println("Scalene");
				return "scalene";
			}
				
			else { 
				System.out.println("Isoceles");
				return "isoceles";
			}
		}
		else {
			System.out.println("Invalid");
			return "invalid";
		}
			
	}
}
