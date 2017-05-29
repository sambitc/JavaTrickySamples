package com.sam.designpattern.decoratorPattern;

public class MushroomToppingDecorator extends ToppingDecorator{

	public MushroomToppingDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createPizza(){
		System.out.println("mashroom decorator create pizza+++++++++++");
		pizza.createPizza();
		
		addTopping();
	}

	private void addTopping() {
		System.out.println("Mushroom topping added.....");
	}

}
