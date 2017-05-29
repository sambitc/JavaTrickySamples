package com.java.prac.designpattern;

public class ShapeDecorator implements Shape{
	
	Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}



	@Override
	public void createShape() {
		//shape.createShape();
		
	}

}
