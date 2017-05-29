package com.sam.designpattern.decoratorPattern;

public class Main {
	
	 public static void main(String args[]){
		
		Pizza pizza = new VegPizza("Large");
//		pizza.createPizza();
		
		// with topping.
		Pizza pizzaWithTopping = new MushroomToppingDecorator(pizza);
		//pizzaWithTopping = new CheeseToppingDecorator(pizzaWithTopping);
		pizzaWithTopping.createPizza();
		
		try{
			
		}catch (NullPointerException e) {
			throw e;
		}
	}
	 
	 

}
