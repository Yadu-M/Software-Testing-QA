package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Q7 {
	public String baseUrl = "https://www.linkedin.com/login";
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	@Test(priority=0)
	public void openBrowser() {
		System.out.println("Test 1: Opening browser (firefox)");
		driver = new FirefoxDriver();
	}
	
	@Test(priority=1)
	public void launchLinkedin() {
		System.out.println("Test 2: Launching Linkedin in browser");
		driver.get(baseUrl);		
	}
	
	@Test(priority=2)
	public void peformSeachAndClick1stLink() throws InterruptedException {
		System.out.println("Test 3: Inputting information (\"Linkedin\")");
		String email = "email";
		String pass = "pass!";
		
		WebElement email_field = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass_field = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement signin_button = driver.findElement(By.xpath("//button[@aria-label='Sign in']"));		
		
		email_field.clear();
		pass_field.clear();
		
		email_field.sendKeys(email);
		pass_field.sendKeys(pass);
		signin_button.click();
		
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void LinkedinLoginVerification() {
		System.out.println("Test 4: Testing and verifying the title of the Linkedin landing page");
		String linkedin_url = "https://www.linkedin.com/feed/";
		String page_link = driver.getCurrentUrl();
		AssertJUnit.assertEquals(page_link, linkedin_url);
		System.out.println("Login has been successful");
	}
	
	
}
