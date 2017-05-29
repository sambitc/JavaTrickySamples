package com.java.prac.designpattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	public void createShape(){
		shape.createShape();
		
		drawRed();
	}

	private void drawRed() {
		System.out.println("Coloring red.............");
		
	}

}
