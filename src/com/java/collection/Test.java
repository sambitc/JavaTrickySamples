package com.java.collection;

public interface Test {
	
	static int Method(){
		return 1;
	}
	
	default int Method1(){
		return 1;
	}
	
	interface Test1{
		default int Method1(){
			return 1;
		}
	}
	
	interface Test2{
		default int Method1(){
			return 1;
		}
	}
	
	class ClassTest implements Test1,Test2{
//		public int Method1(){
//			return 1;
//		}
	}

}
