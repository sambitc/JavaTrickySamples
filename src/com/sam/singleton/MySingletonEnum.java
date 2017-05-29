package com.sam.singleton;

public enum MySingletonEnum {
	INSTANCE;
	private MySingletonEnum() {
		System.out.println("Here");
	}
	
	private void test(){
		System.out.println("here is test method....");
	}
	
	public static void main(String[] args) {
	    MySingletonEnum.INSTANCE.test();
	}
}
