package com.java.serialization.customize.animator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadAnimationToFile {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		writeAnimationClassToFile();
		
	}

	private static void writeAnimationClassToFile() throws IOException, ClassNotFoundException {
		
		// write object=======================
//		FileOutputStream fout = new FileOutputStream(new File("E://animation.ser"));
//		ObjectOutputStream oout = new ObjectOutputStream(fout);
//		
//		// Create object
//		PersistentAnimationV1 paV1 = new PersistentAnimationV1(2000);
//		NonSerializable nonSerial = new NonSerializable();
//		nonSerial.setStr("non serializable----------");
//		paV1.setNonSerializable(nonSerial);
//		
//		oout.writeObject(paV1);
//		oout.close();
		//=====================================
		
		
		// Read object---------------------------------------
		FileInputStream fin = new FileInputStream(new File("E://animation.ser"));
		ObjectInputStream oin = new ObjectInputStream(fin);
		PersistentAnimationV1 paV1 = (PersistentAnimationV1)oin.readObject();
		
		System.out.println("=....................."+paV1.i);
		System.out.println("=....................."+paV1.getNonSerializable().getStr());
		
		fin.close();
		//-----------------------------------------
		
		
		
		
	}

}
