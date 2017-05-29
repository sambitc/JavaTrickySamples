package com.java8.sample;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LambdaSort().shortString();
		new LambdaSort().shortObj();
	}
	
	private void shortObj() {

		Student st1 = new Student(1, "sambit1");
		Student st2 = new Student(2, "sambit2");
		Student st3 = new Student(3, "sambit3");
		Student st4 = new Student(4, "sambit4");
		Student st5 = new Student(5, "sambit5");
		
		List<Student> stuList = Arrays.asList( st4,st3,st5,st2,st1);

		stuList.sort( ( stu1, stu2 ) ->{
			if(stu1.getAge() == stu2.getAge()){
				return 0;
			}else if (stu1.getAge() > stu2.getAge()){
				return 1;
			}else{
				return -1;
			}
		} );
		
		stuList.forEach(stu -> System.out.println(stu.getAge()));
	}

	private void shortString(){
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
	}

}
