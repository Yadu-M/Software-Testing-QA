package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import main.Fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class FibonacciTest {
	private final int seqNum;
	private final int expected;
	
	public FibonacciTest(int seqNum, int expected) {
		this.seqNum = seqNum;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Iterable<Object []> data() {
		return Arrays.asList(new Object[][]{
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
		});
	}
	
	@Test
	public void fibTest() {
		int actual = Fibonacci.compute(seqNum);
		assertEquals(expected, actual);
	}
}