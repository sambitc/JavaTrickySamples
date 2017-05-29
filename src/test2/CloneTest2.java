package test2;

import test.CloneTest;

public class CloneTest2{
	
	public static void main(String args[]) throws CloneNotSupportedException {
		CloneTest ct = new CloneTest();
		CloneTest ctClone = (CloneTest)ct.clone();
		ctClone.cs.k = 123;
		System.out.println(ctClone.cs.k);
		System.out.println(ct.cs.k);
	}

}
