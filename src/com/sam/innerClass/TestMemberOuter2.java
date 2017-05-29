package com.sam.innerClass;

public class TestMemberOuter2 {
	private  int data = 30;
	
	public static void method(){
		
	}

	public static void main(String args[]) {
		TestMemberOuter2 obj = new TestMemberOuter2();
//		TestMemberOuter2.Inner in = obj.new Inner();
		TestMemberOuter2.Inner in = new TestMemberOuter2.Inner();
		in.msg();
		

//		Inner in1 = new Inner();
	}

	private static class Inner {
		private int l=0;
		void msg() {
//			System.out.println("data is " + data);
			
			method();
		}
	}
}