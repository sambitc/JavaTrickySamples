package com.sam.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints=" + sum);
		
		//
		
		List<Double> doubles = new ArrayList<>();
		doubles.add(2d);
		doubles.add(5d);
		doubles.add(10d);
		 sum = sum(doubles);
		System.out.println("Sum of ints=" + sum);
	}

	public static double sum(List<? extends Number> list) {
		list.add(1d);
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
}
