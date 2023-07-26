package com.assert_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assert_Sample {
	@Test
	public void assertion() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse\\TestNG_STCM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String actualTitle= driver.getTitle();
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		System.out.println("Actual Title: "+actualTitle);
		System.out.println("Expected Title: "+expectedTitle);
		
		//Hard Assert - Its execute single assertion fucntion
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		WebElement mobilePage=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobilePage.click();
		String mobileActualTitle=driver.getTitle();
		
		String mobileExpectedTitle = "Mobile";
		
		System.out.println("Actual Mobile Page Title: "+mobileActualTitle);
		System.out.println("Expected Mobile Page Title: "+mobileExpectedTitle);
		
		//Soft Assert
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertEquals(mobileActualTitle, mobileExpectedTitle);
		
		
		// soft assert possible only we implemenet assertAll() function, its execute multiple assertion
		
		soft.assertAll();
	}

}
