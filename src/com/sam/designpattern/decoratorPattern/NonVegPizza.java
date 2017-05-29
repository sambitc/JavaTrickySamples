package com.sam.designpattern.decoratorPattern;

public class NonVegPizza implements Pizza{
	
	String pizzaType;
	
	public  NonVegPizza(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	@Override
	public void createPizza() {
		System.out.println("Creating " + pizzaType + " non-veg pizza.....");
		
	}

}
