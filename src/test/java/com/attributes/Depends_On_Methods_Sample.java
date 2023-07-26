package com.attributes;

import org.testng.annotations.Test;

public class Depends_On_Methods_Sample {
	@Test
	public void signUp() {
	//	int a= 5/0; // if it is exception happen for dependsonmethod, the dependecy method will be SKIPPED
		System.out.println("User Register their details");
	}

	@Test (dependsOnMethods = "login") // if we didn't use dependsonmethods attribute the remaining methid will be FAILED, when the feature depends on the methods
	public void searchProduct() {
		System.out.println("user search a product");
	}
	@Test (dependsOnMethods = "signUp")
    public void login() {
		System.out.println("user should login for search product");
	}
	
}
