package com.shivam.firstApp;

import org.springframework.stereotype.Component;

@Component
public class Ferrari implements Car {

	public void driveCar() {
		System.out.println("Driving Ferrari car");
	}

}
