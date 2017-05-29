package com.sam.designpattern.decoratorPattern;

public class VegPizza implements Pizza{
	
	String pizzaType;
	
	public  VegPizza(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	@Override
	public void createPizza() {
		System.out.println("Creating " + pizzaType + " veg pizza.....");
		
	}

}
