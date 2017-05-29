package test;

public class CloneTest implements Cloneable{
	
	public int i =5;
	
	public CloneSub cs = new CloneSub();
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		CloneTest ct = new CloneTest();
		System.out.println(((CloneTest)ct.clone()).i);
	}

}
