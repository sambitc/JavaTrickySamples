package com.java.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {

	Queue<Double> queue;

	public Consumer(Queue<Double> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			
			synchronized (queue) {
				if (queue.size() > 0) {
					System.out.println("consume-------" + queue.poll());
				} else {
					try {
						System.out.println("qeury emdpty --- consumer waiting");
						queue.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
