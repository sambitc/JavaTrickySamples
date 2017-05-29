package com.sam.classTest;

 class TestClass implements Inter{
	
//	 int s = 0;
//	
//	public static void test(){
//		int i;
//		int k = i;
//	}
//	
//	public  void test1(){
//		int i;
//		int k = i;
//	}
	
	 public static void main(String[] args) throws Exception
	    {
	        String s = "foo"; 
	        Object o = new Object(); 
	        
	        System.out.println(o instanceof String );
	        
	        Parent p = new Parent();
	        Child c = new Child();
	        
	        p = c;
	        
	        System.out.println(p instanceof Child );
	        System.out.println(p.getClass() );
	        
	        System.out.println(p instanceof Parent );
	        System.out.println(p.getClass() );
	        
	        //--------------------
	        
	        //-------------------
	        
	        
	        Integer iob =100;
	        System.out.println(iob++);
	    } 
	 
	 static class Parent{
		 int k;
		 
		 void method(){
			 
		 }
	 }
	 
	 static class Child extends Parent {
		 int j = 10;
		 
		 @Override
		 public void method(){}
	 }

}
