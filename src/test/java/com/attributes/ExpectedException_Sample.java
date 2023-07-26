package com.attributes;

import org.testng.annotations.Test;

public class ExpectedException_Sample {

		@Test(expectedExceptions = Exception.class) // The way for not showing the result but method will be passed like skipping exception
		public void method() {
			int a =5/0;
			System.out.println(a);
		}
		@Test
		public void print() {
			System.out.println("Dummy");
		}
}
