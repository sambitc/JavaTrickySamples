package com.java8.sample;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionComposition {
	public static void main(String args[]){
		
		Function<Integer,Integer> add1 = x -> x + 1;
		Function<Integer,Integer> mul3 = x -> x * 3;
		
		BinaryOperator<Function<Integer,Integer>> compose = (f,g) -> x -> g.apply(f.apply(x));
		
		Function<Integer,Integer> fun = compose.apply(add1, mul3);
		System.out.println(fun.apply(10));
		
		//-----------
		Function<Integer,Integer> h = mul3.compose(add1);
		Integer res = h.apply(10);
		
		
	
	}
}
