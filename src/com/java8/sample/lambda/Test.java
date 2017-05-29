package com.java8.sample.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String args[]){
		new Test().createThread();
	}
	
	private void createThread() {
		Thread thread = new Thread(() -> {System.out.println("done");});
		Thread thread1 = new Thread(this :: doTask);
		
		thread.start();
		thread1.start();
		
		List<String> names = Arrays.asList("btn1", "btn2", "btn3");
		Button[] buttons = names.stream().toArray(Button[] :: new);
		
	}

	public void doTask(){
		System.out.println("---- task done");
	}
	
	
	class Button {
		String btnName;
		
		Button(String name){
			
		}
	}

}
