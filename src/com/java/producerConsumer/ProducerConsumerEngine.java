package com.java.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerEngine {
	public static void main(String args[]){
		Queue<Double> queue = new LinkedList<>();
		
		Producer producer = new Producer(queue);
		
		Consumer consumer = new Consumer(queue);
		
		Thread prodTh = new Thread(producer);
		Thread consTh = new Thread(consumer);
		
		prodTh.start();
		consTh.start();
	}
}
