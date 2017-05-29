package com.java.comapreEqual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	interface Compare extends Comparator<CompareTest> {
		
	}

	static Comparator<CompareTest> c1 = new Comparator<CompareTest>() {

		public int compare(CompareTest o1, CompareTest o2) {
			if(o1.age == o2.age){
				return 0;
			}
			
			if(o1.age < o2.age){
				return -1;
			}
			
			return 1;
		}
	};
	
	
	public static void main(String args[]){
		CompareTest ct1 = new CompareTest();
		ct1.setAge(0);
		
		CompareTest ct2 = new CompareTest();
		ct2.setAge(11);
		
		CompareTest ct3 = new CompareTest();
		ct3.setAge(2);
		
		List<CompareTest> list = new ArrayList<>();
		list.add(ct1);
		list.add(ct2);
		list.add(ct3);
		Collections.sort(list, CompareTest.c1);
		
		System.out.println(list.get(0).getAge() + "----" +list.get(1).getAge());
	}

}
