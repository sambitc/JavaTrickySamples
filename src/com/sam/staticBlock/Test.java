package com.sam.staticBlock;

public class Test {
	
   static void method(char[] str){
	   System.out.println("stirng");
   }
   
   static void method(char str){
	   System.out.println("object");
   }
	
	
	public static void main(String args[]){
		method(null);
		
		System.out.println(null);
	}

}
