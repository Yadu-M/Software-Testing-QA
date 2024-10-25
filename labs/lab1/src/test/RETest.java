package test;

import static org.junit.Assert.*;
import main.RE;

import org.junit.Test;

public class RETest {

	@Test
	public void PhoneNumber1TrueTest() {
		String s = "(123) 456 - 7890";
		assertTrue(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber2TrueTest() {
		String s = "(123)456 - 7890";
		assertTrue(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber3TrueTest() {
		String s = "(123) 456- 7890";
		assertTrue(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber4TrueTest() {
		String s = "(123) 456 -7890";
		assertTrue(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber1FalseTest() {
		String s = "123 123 - 1234";
		assertFalse(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber2FalseTest() {
		String s = "123KL456  7890";
		assertFalse(RE.checkPhoneNumber(s));
	}
		
	@Test
	public void PhoneNumber3FalseTest() {
		String s = "123J 456  7890";
		assertFalse(RE.checkPhoneNumber(s));
	}
	
	@Test
	public void PhoneNumber4FalseTest() {
		String s = "123456-7890";
		assertFalse(RE.checkPhoneNumber(s));
	}
}
