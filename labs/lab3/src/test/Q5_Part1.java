package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class Q5_Part1 {
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	@Test(priority=0)
	public void openBrowser() {
		System.out.println("Test 1: Opening browser (firefox)");
		driver = new FirefoxDriver();
	}
	
	@Test(priority=1)
	public void launchGoogle() {
		System.out.println("Test 2: Launching Google in browser");
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);		
	}
	
	@Test(priority=2)
	public void peformSeachAndClick1stLink() throws InterruptedException {
		System.out.println("Test 3: Performing search (\"Facebook\")");
		WebElement search_field = driver.findElement(By.xpath("//textarea[@title='Search']"));
		search_field.clear();
		search_field.sendKeys("Facebook", Keys.RETURN);
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void FaceBookPageTitleVerification() {
		System.out.println("Test 4: Testing and verifying the title of the Google search page");
		String page_title = driver.getTitle();
		System.out.println(page_title);
		AssertJUnit.assertEquals(page_title, "Facebook - Google Search");
	}
	
	@Test(priority=4)
	public void driverexit() {
		System.out.println("Test 5: Exiting driver");
		driver.close();
	}
	
	
}