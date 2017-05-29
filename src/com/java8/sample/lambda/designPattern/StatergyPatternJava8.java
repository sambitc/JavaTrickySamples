package com.java8.sample.lambda.designPattern;

import java.util.List;

public class StatergyPatternJava8 {
	public static void main(String args[]) {
		new StatergyPatternJava8().play();
	}

	private void play() {
		
		//-----------
		Calculator sum = (a, b) -> a + b;
		System.out.println(sum.calculate(2, 5));
		
		//Subtract
		Calculator diff = (a, b) -> a - b;
		System.out.println(diff.calculate(12, 5));

	}

	interface Calculator {
		public int calculate(int a, int b);
	}

}
