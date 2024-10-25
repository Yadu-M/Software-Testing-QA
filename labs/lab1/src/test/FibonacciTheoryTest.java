package test;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;
import main.Fibonacci;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class FibonacciTheoryTest {
	
    @DataPoints
	public static int[][] data = new int[][]{
    	{0, 0},
		{1, 1},	
		{2, 1},
		{3, 2},
		{4, 3},
		{5, 5},
		{6, 8},
		{7, 13},
		{8, 21},
		{9, 34},
	};
    
    @Theory
	public void FibonacciTest(int[] x) {
    	assumeTrue((x[0] >= 0) && (x[1] >= 0));  // Assume the sequence number and the Fibonacci number starts from 0

    	int actual = Fibonacci.compute(x[0]);
    	assertEquals(x[1], actual);
	}

}
