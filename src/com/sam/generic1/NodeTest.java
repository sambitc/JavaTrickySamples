package com.sam.generic1;

import com.sam.generic.Animal;
import com.sam.generic.Dog;

public class NodeTest {
	public static void main(String args[]){
//		MyNode mn = new MyNode(5);
//		Node n = mn;           // A raw type - compiler throws an unchecked warning
//		n.setData("Hello");    // Causes a ClassCastException to be thrown.
//		Integer x = mn.data;
		
		
		Node<Number> node = new Node<Number>(1);
		node.printData();
		
		Node<? extends Animal> nodeType = new Node<Animal>(new Dog());
		nodeType.printData();
	}
	
	public Animal method(){
		return new Dog();
	}
}
