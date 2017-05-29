package com.java.serialization.customize.animator;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistentAnimationV2 implements Runnable, Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private transient Thread aniThread;
	private int animSpeed;
	
	public PersistentAnimationV2(){
		
	}

	public PersistentAnimationV2(int animationSpeed) {
		this.animSpeed = animationSpeed;
		startAnimation();
	}

	private void startAnimation() {
		
		aniThread = new Thread(this);
		aniThread.start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("animation running===================");
			try {
				Thread.sleep(animSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		animSpeed = in.readInt();
		startAnimation();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(animSpeed);
		
	}

}
