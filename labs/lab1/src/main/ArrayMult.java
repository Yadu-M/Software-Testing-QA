package main;

public class ArrayMult {
	public int[] mult(int [] array1, int[] array2) {
		int longArraylen = 0;
		int shortArraylen = 0;
		
		if (array1.length > array2.length) {
			longArraylen = array1.length;
			shortArraylen = array2.length;
		}
		else {
			longArraylen = array2.length;
			shortArraylen = array1.length;
		}
		
		int outArray[] = new int[longArraylen];
			
		
		for (int i = 0; i < longArraylen; i++) {
			if (i < shortArraylen)
				outArray[i] = array1[i] * array2[i];
			else {
				if (array1.length == longArraylen)
					outArray[i] = array1[i];
				else
					outArray[i] = array2[i];
			};
			
		}
		
		
		return outArray;
	}
}





