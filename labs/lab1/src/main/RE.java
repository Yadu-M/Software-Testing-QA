package main;

import java.util.*;

public class RE {
	
	public static boolean checkPhoneNumber(String s) {
		return s.matches("\\s*\\(\\s*\\d{3}\\s*\\)\\s*\\d{3}\\s*-\\s*\\d{4}\\s*"); // extra "\" to escape character
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String input = sc.nextLine();
		boolean wasPhoneNum = checkPhoneNumber(input);
		System.out.println("\nThat was" + (wasPhoneNum? "" : "n't") + " a phone number.");
		sc.close();
	}

}
