package com.sam.innerClass;

import com.sam.singleton.BillPughSingleton;

class TestOuter2 {
	private static int data = 30;
	
	int j = 100;

	static class Inner {
		int k = 0;
		private static final BillPughSingleton INSTANCE = null;

		static void msg() {
			System.out.println("data is " + INSTANCE);
		}
	}

	public static void main(String args[]) {
		TestOuter2.Inner.msg();// no need to create the instance of static
					// nested class
		
		TestMemberOuter2 tmo = new TestMemberOuter2();
//		TestMemberOuter2.Inner inner = tmo.new Inner();
		TestMemberOuter2.Inner inner1 = new TestMemberOuter2.Inner();
		
		//inner.l;
	}
	

}
