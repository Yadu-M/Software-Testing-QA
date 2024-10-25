package test;

import static org.junit.Assert.*;
import main.ArrayMult;

import org.junit.Test;

public class ArrayMultTest {

	@Test
	public void ArrayMultiplicationTest() {
		ArrayMult ob = new ArrayMult();
		int [] arr1 = new int[] {1, 2, 34, 5};
		int [] arr2 = new int[] {7, 8, 1, 9, 23};
		
		assertArrayEquals(new int[] {7, 16, 34, 45, 23}, ob.mult(arr1, arr2));
	}

}
