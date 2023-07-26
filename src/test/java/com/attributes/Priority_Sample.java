package com.attributes;

import org.testng.annotations.Test;

public class Priority_Sample {
	
	//Normally in TestNG method will execute ASCII order(Alphabet)
	//when we use priority attribute its execute in priority based like negative to positive (-1,0,1,2)
	
	@Test(priority = -1)
	public void godofwar() {
		System.out.println("God of War");

	}
	//when we dont use priority for method its take the priority value is 0
	//if multiple method doesn't have priority all are declared as 0, So its all are SAME(0 value) then it will execute in ASCII based
	@Test
	public void princeofpersia() {
		System.out.println("Price of Persia");
	}
	@Test (priority = 2)
	public void shadowofrome() {
		System.out.println("Shadow of Rome");

	}
	@Test (priority = 1)
	public void downhill() {
		System.out.println("Dowbhill Domination");

	}
}
