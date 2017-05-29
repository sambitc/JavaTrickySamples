package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {

	/**
	 * @author Arpit Mandliya
	 */
	public static void main(String[] args) {

		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);

		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);
		
		Country china = new Country("china", 1999);

		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		countryCapitalMap.put(russia, "Moscow");
		countryCapitalMap.put(china, "bejing");

		Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();// put
																						// debug
																						// point
																						// at
																						// this
																						// line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
	}

}
