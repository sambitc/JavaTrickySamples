package com.java.cloneSample.sampleTest;

public class SampleClonable implements Cloneable{
	
	Test test = new Test();
	
	//@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}
