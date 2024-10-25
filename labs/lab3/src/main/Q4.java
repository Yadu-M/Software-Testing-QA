package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q4 {
	public static String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
	String driverPath = "C:\\geckodriver.exe";
	private static WebDriver driver;
	private static String name = "Yadu Krishnan Madhu";
	
	
	public static void main(String args[]) {
		System.out.println("launching firefox browser");
		driver = new FirefoxDriver();
		driver.get(baseUrl);		
		
		WebElement second_item = driver.findElement(By.name("li2"));
		WebElement fourth_item = driver.findElement(By.name("li4"));
		WebElement submit_field = driver.findElement(By.id("sampletodotext"));
		WebElement submit_button = driver.findElement(By.id("addbutton"));
		
		second_item.click();  // Checking second item
		fourth_item.click();  // Checking fourth item
		submit_field.clear();  // Clearing the submit field
		submit_field.sendKeys(name);  // Adding my name to the submit field
		submit_button.click();  // Submitting the form
	}
}
