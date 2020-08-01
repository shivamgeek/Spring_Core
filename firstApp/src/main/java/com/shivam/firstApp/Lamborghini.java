package com.shivam.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lamborghini implements Car {
	
	@Autowired
	Tyre tyre1;
	
	
	public Tyre getTyre() {
		return tyre1;
	}


	public void setTyre(Tyre tyre) {
		this.tyre1 = tyre;
	}


	public void driveCar() {
		System.out.println("Driving Lamborghini car, Tyre Data = "+tyre1);
	}
	
}
