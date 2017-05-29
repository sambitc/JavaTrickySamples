package com.sam.generic;

public class Test<T extends Comparable<T>> {

	private T data;
	private Test<T> next;

	public Test(T d, Test<T> n) {
		this.data = d;
		this.next = n;
	}

	public T getData() {
		data.
		return this.data;
	}
}
