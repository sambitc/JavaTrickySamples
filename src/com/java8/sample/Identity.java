package com.java8.sample;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Identity {
	public static void main(String args[]) {

		new Identity().doWork();

	}

	private void doWork() {
		UnaryOperator<String> i = (x) -> x.toUpperCase();
		System.out.println(i.apply("java2s.com"));

		// ---------------
		Country cc = new Country();
		UnaryOperator<Country> country = (x) -> x.getStatev1();
		System.out.println(country.apply(cc).details);
		
		Function<Country, String> str = (x) -> x.getState();
		System.out.println(str.apply(cc));

	}

	class Country {

		String details = "details";

		public String getState() {
			return "hare we are";
		}

		public Country getStatev1() {
			return new Country();
		}
	}
}
