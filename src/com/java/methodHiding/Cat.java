package com.java.methodHiding;

public class Cat extends Animal {
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
    
    public static void main(String args[]){
    	Animal.foo(); // prints Animal
    	Cat.foo(); // prints Cat

    	Animal a = new Animal();
    	Animal b = new Cat();
    	Cat c = new Cat();
    	Animal d = null;

    	a.foo(); // should not be done. Prints Animal
    	b.foo(); // should not be done. Prints Animal because the declared type of b is Animal
    	c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
    	d.foo(); // should not be done. Prints Animal because the declared type of b is Animal
    }
}