package com.attributes;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Invocationcount_Sample {
	@Test(invocationCount = 2) // the method will execute as per count like RETEST
	public void method() {
		int a[] = {10,5,16,85,65,45,20};
		Arrays.sort(a);
		System.out.println("Descending order");
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}	
		
		System.out.println("Second smallest Number "+a[1]);
		System.out.println("Second largest Number "+a[a.length-2]);
		
	}
	@Test
	public void print() {
		System.out.println("Dummy");
	}
	
}
