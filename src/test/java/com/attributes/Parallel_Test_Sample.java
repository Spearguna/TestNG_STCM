package com.attributes;

import org.testng.annotations.Test;

public class Parallel_Test_Sample { // parallel test runs in xml or suite file, when we use paralle test the methods should be separate not depends
	@Test () // when we done parallel test the time will be saved
	public void reverseLetter() {
		String s1 = "Java is a Programing Launage";
		char[] letter=s1.toCharArray();
		for(int i =letter.length-1; i>=0; i--) {
			System.out.print(letter[i]);
		}
		System.out.println();
	}
	
	@Test
	public void reverseWord() {
		System.out.println();
		String s1 = "Java is a Programing Launage";
		String[] word=s1.split(" ");
		for(int i =word.length-1; i>=0; i--) {
			System.out.print(word[i]+" ");
		}
	}
}
