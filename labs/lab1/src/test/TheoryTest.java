package test;

import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class TheoryTest {

    @DataPoints
    public static int[] data1 = new int[]{1, 2, 307, 400567};
    
    @DataPoints
    public static int[] data2 = new int[]{0, -1, -10, -1234, 1, 10, 6789};
    
    @DataPoints
    public static int[] data3 = new int[]{0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
    
    @Theory
    public void ATest(int a, int b) {
    	assumeTrue((a > 0) && (b > 0));  // Assume that a and b is greater than 0
    	assumeTrue(a < (Integer.MAX_VALUE - b));  // Prevents overflow
    	assumeTrue(b < (Integer.MAX_VALUE - a));
        assertTrue((a + b) > a);
    }
    
    @Theory
    public void BTest(int a, int b) {
    	assumeTrue((a > 0) && (b > 0));
       	assumeTrue(a < (Integer.MAX_VALUE - b));
    	assumeTrue(b < (Integer.MAX_VALUE - a));
        assertTrue((a + b) > b);
    }
    
    @Theory
    public void CommutativeTest(int a, int b) {  // Commutative Test
    	assumeTrue(a < (Integer.MAX_VALUE - b));
    	assumeTrue(b < (Integer.MAX_VALUE - a));
    	assumeTrue((a > 0) && (b > 0));
        assertTrue((a + b) == (b + a));
    }
}