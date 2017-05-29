package com.java8.sample.lambda.designPattern;

import java.util.function.Supplier;

public class FactoryPatternJava8 {
	public static void main(String args[]) {
		new FactoryPatternJava8().call();
	}

	private void call() {
		
		Supplier<Product> product = Car :: new;

	}

	public interface Product {

	}

	public class Bike implements Product {

	}
	
	public class Car implements Product {

	}
}
