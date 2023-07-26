package com.attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnotation_Sample {
	@Test
	@Ignore // this is one way to ignore method
	public void cricket() {
		System.out.println("T20 Cricket");
	}
	@Test (enabled = false) // This is another way to ignore mwthod
	public void footBall() {
		System.out.println("The Football League");
	}
	@Test // Third way use xml suite and add method name in exclude tag
	public void motogp() {
		System.out.println("Italy Race Track");
	}
	@Test
	public void basketBall() {
		System.out.println("BaseketBall Plaers");
	}
}
