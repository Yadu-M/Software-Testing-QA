package test;

import static org.junit.Assert.*;
import main.Triangle;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	private Triangle t1;
	private Triangle t2;
	private Triangle t3;
	
	@Before
	public void TriangleInitTest() throws Exception{
		t1 = new Triangle(3, 4, 5);
		t2 = new Triangle(5, 4, 3);
		t3 = new Triangle(8, 5, 5);
	}

	@Test // Checking area of t1
	public void CalculateAreaTest1() {		
		assertEquals(6, t1.calculateArea(), 0.1);
	}
	
	@Test // Checking area of t2
	public void CalculateAreaTest2() {				
		assertEquals(6, t2.calculateArea(), 0.1);
	}
	
	@Test // Checking area of t3
	public void CalculateAreaTest3() {				
		assertEquals(12, t3.calculateArea(), 0.1);
	}
	
	@Test // Checking if t1 area equals t2 area
	public void AreaCompareTest() {
		assertEquals(t1.calculateArea(), t2.calculateArea(), 0.1);
	}
	
	@Test(expected=Exception.class) // Testing for negative cases
	public void NegativeSideTest() throws Exception{
		new Triangle(-1, 5, 4);
	}
	
	@Test(expected=Exception.class) // Testing for invalid side
	public void InvalidSideTest() throws Exception{
		new Triangle(3, 4, 100);
	}

}
