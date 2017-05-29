package com.sam.generic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class SomeType<T> {
	
	public <E> void test(final Collection<E> collection) {
		for (final E object : collection) {
			System.out.println("E: " + object);
		}
	}

	public void test(final Set<T> set) {
		for (final T t : set) {
			System.out.println("T from set: " + t);
		}
	}

	public void test(final List<Integer> integerList) {
		int result = 0;
		for (final Integer integer : integerList) {
			result += integer.intValue();
		}
		System.out.println("result: " + result);
	}

	public static void main(String args[]) {
		final SomeType someType = new SomeType();
		final List<String> list = Arrays.asList("some", "test", "value");
		
		someType.test(list);
		
		List<Object> list1 = new ArrayList<Object>();
		
		List<?> list2 = new ArrayList<Object>();
		list2.add
	
	}
}