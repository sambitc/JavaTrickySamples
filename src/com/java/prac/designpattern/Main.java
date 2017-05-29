package com.java.prac.designpattern;

public class Main {
	
	public static void main(String args[]){
		Shape redCircle = new Circle();
		redCircle = new RedShapeDecorator(redCircle);
		
		redCircle.createShape();
		
		
		
	}

}
