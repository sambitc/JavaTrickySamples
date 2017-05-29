package com.java.returnFinally;

public class ReturnFinally {

	public int xx() {
		
		try {
			String str = null;
			str.length();
			return 45;
		} catch (NullPointerException e) {
			throw e;
		} finally {
			return 12;
		}
		
	}

	public static void main(String args[]) {
		System.out.println(new ReturnFinally().xx());
	}

}
