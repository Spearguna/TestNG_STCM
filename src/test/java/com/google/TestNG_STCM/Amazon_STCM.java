package com.google.TestNG_STCM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_STCM {
	public static WebDriver driver;
	@BeforeSuite
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse\\TestNG_STCM\\driver\\chromedriver.exe");

	}
	@BeforeTest
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void urlLaunch() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement singIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		singIn.click();
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		
		Thread.sleep(15000);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("8778920213");
		WebElement continueButton=driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("tn01bc0444");
		WebElement signInButton=driver.findElement(By.id("signInSubmit"));
		signInButton.click();
		
//		Thread.sleep(20000);
//		WebElement continue_Button=driver.findElement(By.xpath("//input[@type='submit']"));
//		continue_Button.click();
//		Thread.sleep(20000);
//		WebElement otpSubmitButton=driver.findElement(By.xpath("//span[text()='Submit code']"));
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit code']\"")));
//		otpSubmitButton.click();
	}
	@Test
	public void searchAsus() {
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("asus");
		WebElement clickSearch=driver.findElement(By.xpath("//input[@type='submit']"));
		clickSearch.click();
	}
	@Test
	public void searchpPS5() {
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("PS5");
		WebElement clickSearch=driver.findElement(By.xpath("//input[@type='submit']"));
		clickSearch.click();
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Actions aa = new Actions(driver);
		WebElement accountLits=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		aa.moveToElement(accountLits);
		aa.build().perform();
		Thread.sleep(3000);
		WebElement singOut=driver.findElement(By.xpath("//span[text()='Sign Out']"));
		singOut.click();
		Thread.sleep(20000);
	}
	@AfterClass
	public void getTitile() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@AfterTest
	public void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
	
	

}
