package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Q6 {
	
	@Test
	public void executSessionOne() {
		System.out.println("Executing Session 1");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4");
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	@Test
	public void executSessionTwo() {
		System.out.println("Executing Session 2");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4");
		driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}
	
	@Test
	public void executSessionThree() {
		System.out.println("Executing Session 3");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4");
		driver.findElement(By.name("uid")).sendKeys("Driver 3");
	}
}
