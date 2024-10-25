package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import main.PrimeNumberChecker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class PrimeNumberCheckerTest {

	private final boolean expected;
	private final int primeNum;
	
	public PrimeNumberCheckerTest(int primeNum, boolean expected) {
		this.expected = expected;
		this.primeNum = primeNum;
	}
	
	@Parameterized.Parameters
	public static Iterable<Object []> data() {
		return Arrays.asList(new Object[][]{
				{2, true},	
				{6, false},
				{19, true},
				{22, false},
				{23, true},
		});
	}
	
	@Test
	public void primeTest() {
		boolean actual = PrimeNumberChecker.primeCheck(primeNum);
		assertEquals(expected, actual);
	}
}
