package test;

import static org.junit.Assert.*;
import main.Triclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriclassTest {
	
	@BeforeClass
	public static void startMessage() {
		System.out.println("Testing started");
	}

	@Test
	public void equilateralTest() {		
		System.out.println("#1 started");
		assertEquals("equilateral", Triclass.classify(5, 5, 5));
		System.out.println("#1 finished");
	}
	
	@Test
	public void scaleneTest() {
		System.out.println("#2 started");
		assertEquals("scalene", Triclass.classify(5, 6, 7));
		System.out.println("#2 finished");
	}
	
	@Test
	public void isocelesTest() {
		System.out.println("#3 started");
		assertEquals("isoceles", Triclass.classify(5, 5, 6));
		System.out.println("#3 finished");
	}
	
	@Test
	public void invalidSidesTest() {
		System.out.println("#4 started");
		assertEquals("invalid", Triclass.classify(5, 5, 10));
		System.out.println("#4 finished");
	}	
	
	@Test
	public void invalidNumberTest() {
		System.out.println("#5 started");
		assertEquals("invalid", Triclass.classify(5, 5, 11));
		System.out.println("#5 finished");
	}
	
	@AfterClass
	public static void endMessage() {
		System.out.println("Testing ended");
	}

}
