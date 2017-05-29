package com.java.prac.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String firstName;
	InnerClass lastNameObject;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public InnerClass getLastNameObject() {
		return lastNameObject;
	}

	public void setLastNameObject(InnerClass lastNameObject) {
		this.lastNameObject = lastNameObject;
	}
	
//	private void writeObject(ObjectOutputStream oos) throws IOException {
//		oos.defaultWriteObject();
//
//		if (lastNameObject != null) {
//			oos.write((lastNameObject.getLastName().getBytes()));
//		}
//	}
//
//	private void readObject(ObjectInputStream oin) throws ClassNotFoundException, IOException {
//		oin.defaultReadObject();
//
//		byte[] bArr = new byte[9];
//		oin.read(bArr);
//
//		InnerClass ic = new InnerClass();
//		ic.setLastName(new String(bArr));
//		setLastNameObject(ic);
//
//	}
	

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String firstName = (String) in.readObject();
		String lastName = (String) in.readObject();
		
		this.setFirstName(firstName);
		
		InnerClass ic = new InnerClass();
		ic.setLastName(lastName);
		
		this.setLastNameObject(ic);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.getFirstName());
		out.writeObject(this.getLastNameObject().getLastName());
		
	}

	/*
	 * Inner class
	 */
	class InnerClass {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String lastName;

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
	//-----------------------------

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		//
		SerializationTest st = new SerializationTest();
		st.setFirstName("sambitc");

		InnerClass ic = st.new InnerClass();
		ic.setLastName("choudhury");
		st.setLastNameObject(ic);

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("d:/obj.ser"));
			oos.writeObject(st);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}

		//
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("d:/obj.ser"));
			SerializationTest stRetrived = (SerializationTest) ois.readObject();
			System.out.println(stRetrived.getFirstName() + "-------" + stRetrived.getLastNameObject().getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
