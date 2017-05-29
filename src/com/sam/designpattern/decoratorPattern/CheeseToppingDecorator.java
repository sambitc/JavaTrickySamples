package com.sam.designpattern.decoratorPattern;

public class CheeseToppingDecorator extends ToppingDecorator{

	public CheeseToppingDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void createPizza(){
		System.out.println("cheese decorator create pizza+++++++++++");
		pizza.createPizza();
		
		addTopping();
	}

	private void addTopping() {
		System.out.println("Cheese topping added.....");
	}

}
