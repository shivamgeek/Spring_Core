package com.shivam.drawing_shapes;

public class Circle implements Shape {
	
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
