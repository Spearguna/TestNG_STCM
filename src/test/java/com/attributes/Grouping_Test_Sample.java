package com.attributes;

import org.testng.annotations.Test;

public class Grouping_Test_Sample { // groups attribute perform their function only in xml file or suite file
	@Test (groups = "Vehicles")
	public void cars() {
		System.out.println("BMW");
	}
	@Test (groups = "ElectronicDevices")
	public void monitor() {
		System.out.println("Sony Monitor");
	}

	@Test (groups = "Vehicles")
	public void bikes() {
		System.out.println("Ducati");
	}
	
	@Test (groups = "ElectronicDevices")
	public void airconditioner() {
		System.out.println("Carrier AC");
	}

	@Test (groups = "Vehicles")
	public void bus() {
		System.out.println("Volvo");
	}
	
	@Test (groups = "ElectronicDevices")
	public void washingMachine() {
		System.out.println("LG Washing Machine");
	}


}
