package com.java.program;

public class ArrayMinMax {
	public static void main(String args[]) {
		findMinMax();
	}

	private static void findMinMax() {

		int a[] = { 2, 1, 23, 45, 32, 123, 45, 345, 78, 765, 33, 22, 14 };
		int temp = 0;
		int pos = 0;
		for (int i : a) {
			

			if (pos == 0) {
				temp = i;
			}

			if (pos > 0 && i < temp) {
				temp = i;
			}

			pos++;
		}
		
		System.out.println(temp);

	}
}
