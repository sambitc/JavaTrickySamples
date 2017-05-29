package com.java.serialization.customize.animator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistentAnimationV0 implements Runnable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient Thread aniThread;
	private int animSpeed;
	
	public PersistentAnimationV0(int animationSpeed) {
		this.animSpeed = animationSpeed;
		aniThread = new Thread(this);
		aniThread.start();
	}

	@Override
	public void run() {
		while(true){
			System.out.println("animation running===================");
			try {
				Thread.sleep(animSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
