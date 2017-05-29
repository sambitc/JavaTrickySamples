package com.sam.oracleGeneric;

public class Test {
	public static void main(String args[]) {
		
		Box box = new Box();
		box.set(1);
		box.set("string");
		
		BoxGeneric<String> boxG = new BoxGeneric<>();
		boxG.set("Anoter String");
		
		BoxGeneric boxRaw = new BoxGeneric();
		boxRaw.set("");
		
	}
}
