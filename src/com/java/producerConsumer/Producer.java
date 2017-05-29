package com.java.producerConsumer;

import java.util.Queue;

public class Producer implements Runnable {

	Queue<Double> queue;

	public Producer(Queue<Double> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				if (queue.size() <= 3)  {
					double random = Math.random();
					System.out.println("producing-------" + random);
					queue.add(random);

					queue.notify();
				}else if(queue.size() == 3){
					System.out.println("queue is full ----- producer is waiting");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}
