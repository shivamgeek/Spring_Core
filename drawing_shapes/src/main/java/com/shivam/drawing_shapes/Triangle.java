package com.shivam.drawing_shapes;

import java.util.List;

public class Triangle implements Shape {

	private List<Point> points;	


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw() {
		for(Point p : points) {
			System.out.println("Drawing shape Triangle, points are "+p);
		}
	}
	
}
