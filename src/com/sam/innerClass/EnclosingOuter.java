package com.sam.innerClass;

class EnclosingOuter {
	private int noInnerClass = 1;

	public void getNoOfInnerClasses() {
		Inner in = new Inner();
		System.out.println("No Of Inner classes is :" + in.getNoOfClassesFromOuter());
	}

	class Inner {
		public int getNoOfClassesFromOuter() {
			return noInnerClass;
		}
	}
}
