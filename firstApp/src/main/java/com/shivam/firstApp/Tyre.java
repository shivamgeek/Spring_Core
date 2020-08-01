package com.shivam.firstApp;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "Tyre of brand "+brand+" running";
	}
	
}
