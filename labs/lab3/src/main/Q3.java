package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3 {
	public static String baseUrl = "http://www.facebook.com";
	String driverPath = "C:\\geckodriver.exe";
	public static WebDriver driver ;
	
	public static String getTagName() {
		System.out.println("launching firefox browser");
		driver = new FirefoxDriver();
		driver.get(baseUrl);		
		return driver.findElement(By.id("email")).getTagName();
	}
	
	public static void main(String args[]) {
		System.out.println("Tag name: " + getTagName());	
	}
}
