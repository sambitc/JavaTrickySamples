package com.java.serialization.customize.animator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistentAnimationV1 extends SampleSuperClass implements Runnable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private transient Thread aniThread;
	private int animSpeed;
	private transient NonSerializable nonSerializable;

	public PersistentAnimationV1(int animationSpeed) {
		super(animationSpeed);
		this.animSpeed = animationSpeed;
		startAnimation();
	}

	private void startAnimation() {
		
		aniThread = new Thread(this);
		aniThread.start();
	}
	
	

	public NonSerializable getNonSerializable() {
		return nonSerializable;
	}

	public void setNonSerializable(NonSerializable nonSerializable) {
		this.nonSerializable = nonSerializable;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("animation running----------===================");
			try {
				Thread.sleep(animSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void readObject(ObjectInputStream oin) throws ClassNotFoundException, IOException {
		oin.defaultReadObject();
		super.i = oin.readInt();
		String str = (String)oin.readObject();
		
		//
		NonSerializable nonSerial = new NonSerializable();
		nonSerial.setStr(str);
		setNonSerializable(nonSerial);
		startAnimation();

	}

	private void writeObject(ObjectOutputStream oout) throws IOException {
		oout.defaultWriteObject();
		oout.writeInt(super.i);
		oout.writeObject(getNonSerializable().getStr());

	}

}
