package com.shivam.drawing_shapes;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {
	
	@Autowired
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing shape Circle");
		System.out.println("Circle center is "+center);
	}

}
