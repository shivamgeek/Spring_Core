package com.shivam.drawing_shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape, InitializingBean, DisposableBean {

	private Point pointA_variable, pointB_variable, pointC_variable; 
	
	public Point getPointA_variable() {
		return pointA_variable;
	}


	public void setPointA_variable(Point pointA_variable) {
		this.pointA_variable = pointA_variable;
	}


	public Point getPointB_variable() {
		return pointB_variable;
	}

	public void setPointB_variable(Point pointB_variable) {
		this.pointB_variable = pointB_variable;
	}

	public Point getPointC_variable() {
		return pointC_variable;
	}

	public void setPointC_variable(Point pointC_variable) {
		this.pointC_variable = pointC_variable;
	}

	public void draw() {
		System.out.println("Drawing shape Triangle, points are "+pointA_variable+", "+pointB_variable+", "+pointC_variable);
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init() of Triangle bean called");
	}


	public void destroy() throws Exception {
		System.out.println("DisposableBeann destroy() of Triangle bean called");
	}
	
}
