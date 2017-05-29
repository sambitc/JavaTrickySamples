package com.java.arraysTest;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String args[]){
		int[] intArr = new int[4];
		intArr[0] = 1;
		intArr[1] = 4;
		intArr[3] = 2;
		
		for (int i : intArr) {
			System.out.println(i);
		}
		
		Arrays.sort(intArr);
		
		
		
		for (int i : intArr) {
			System.out.println(i);
		}
		
		for (int j=0; j<4; j++){
			System.out.println(j + "----" +intArr[j]);
		}
		

	}
	
	

}
