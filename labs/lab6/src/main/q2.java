package main;

public class q2 {
	public static void func(int a, int b) {
		if (b > a) {
			b = b - a;
			System.out.println(b);
		}
		else if (a > b) {
			b = a - b;
			System.out.println(b);
		}
		else
			System.out.println(0);
	}
	
	public static void main(String arg[]) {
		q2.func(2, 3);
		q2.func(3, 2);
		q2.func(3, 3);
	}
}
