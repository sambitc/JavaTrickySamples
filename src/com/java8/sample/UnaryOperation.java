package com.java8.sample;

import java.util.function.Function;

public class UnaryOperation {
	public static void main(String args[]){
		new UnaryOperation().test();
	}

	private void test() {
		Function<Integer,Integer> add1 = x -> x + 1;
		Function<String,String> concat = x -> x + 1;
		
		
		System.out.println(add1.apply(10));
		
	}
}
