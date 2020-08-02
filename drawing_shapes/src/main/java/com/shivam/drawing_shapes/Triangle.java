package com.shivam.drawing_shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Autowired
	private Point pointA_variable, pointB_variable, pointC_variable; 

	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}


	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}


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
		System.out.println("Triangle Message is -> "+messageSource.getMessage("abc_msg", null,"\"MESSAGE NOT FOUND\"",null));
	}


	public void myInit() {
		System.out.println("init() of Triangle bean called");
	}


	public void myDestroy() {
		System.out.println("destroy() of Triangle bean called");
	}
	
}
