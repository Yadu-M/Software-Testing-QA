package test;

import static org.junit.Assert.*;
import main.PrimeNumberChecker;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeTrue;


@RunWith(Theories.class)
public class PrimeNumberCheckerTheoryTest {
	
    @DataPoints
	public static Object[][] data = new Object[][]{
    	{2, true},	
		{6, false},
		{19, true},
		{22, false},
		{23, true},
	};
    
    @Theory
	public void PrimeTheoryTest(Object[] x) {
    	assumeTrue(((Integer) x[0] > 0) && ((Integer)x[0] < Integer.MAX_VALUE));  // Assume prime number is greater than 0 and less than MAX_INTEGER
    	
    	boolean actual = PrimeNumberChecker.primeCheck((Integer)x[0]);  
		assertEquals(x[1], actual);
	}
    
}
