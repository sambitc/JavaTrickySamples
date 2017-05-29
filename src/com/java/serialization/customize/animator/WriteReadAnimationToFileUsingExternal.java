package com.java.serialization.customize.animator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadAnimationToFileUsingExternal {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		writeAnimationClassToFile();
		
	}

	private static void writeAnimationClassToFile() throws IOException, ClassNotFoundException {
		
		// write object=======================
//		FileOutputStream fout = new FileOutputStream(new File("E://animationV2.ser"));
//		ObjectOutputStream oout = new ObjectOutputStream(fout);
//		oout.writeObject(new PersistentAnimationV2(2000));
//		oout.close();
		//=====================================
		
		
		// Read object---------------------------------------
		FileInputStream fin = new FileInputStream(new File("E://animationV2.ser"));
		ObjectInputStream oin = new ObjectInputStream(fin);
		PersistentAnimationV2 pam = (PersistentAnimationV2)oin.readObject();
		
		fin.close();
		//-----------------------------------------
		
		
		
		
	}

}
