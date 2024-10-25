package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import main.Q2;

import org.junit.Test;

public class Q2Test {

	@Test(expected=Exception.class)
	public void testIsPalindromeNullCheck() {
		String s = null;
		Q2.isPalindrome(s);
	}
	
	@Test
	public void testIsPalindromeEmpty() {
		String s = "";
		assertTrue(Q2.isPalindrome(s));
	}
	
	@Test
	public void testIsPalindrome1() {
		String s = "abcddcba";
		assertTrue(Q2.isPalindrome(s));
	}
	

	
	@Test
	public void testIsPalindrome2() {
		String s = "iuoghou";
		assertFalse(Q2.isPalindrome(s));
	}
		

}
