package com.sam.designpattern.decoratorPattern;

public abstract class ToppingDecorator implements Pizza{
	Pizza pizza;
	
	public ToppingDecorator(Pizza  pizza){
		this.pizza = pizza;
	}
	
	public void createPizza(){
		System.out.println("astract decorator create pizza+++++++++++");
		pizza.createPizza();
	}

}
