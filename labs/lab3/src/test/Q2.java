package test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Q2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours";
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	@Test
	public void verifyHomepageTitle() {
		System.out.println("launching firefox browser");		
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		System.out.println("Recieved title: " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close(); 
	}
	
}