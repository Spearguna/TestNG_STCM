package com.attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_Sample {
	@Test(timeOut = 1000) // the method will execute within 1 sec, if it is not it will be terminate next method will execute
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse\\TestNG_STCM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void tester() {
		int a =5;
		int b =6;
		int c=a+b;
		System.out.println("The sum of two values: "+c);

	}

}
