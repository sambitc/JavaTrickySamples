package com.sam.generic1;

import java.util.List;

public class Node<T, K> {

	private T data;

	public Node(T data) {
		this.data = data;
	}

	public void setData(T data) {
		System.out.println("Node.setData" + data);
		this.data = data;
	}

	public void printData() {
		System.out.println(data);
	}

	public static <T> T identical(T source) {
		return source;
	}
	
	public T identical1(T source) {
		return source;
	}
	
	public void testMethod(List<? extends T> tData){
		
	}
	
	public void testMethod1(List<? extends T> tData){
		
	}


}
