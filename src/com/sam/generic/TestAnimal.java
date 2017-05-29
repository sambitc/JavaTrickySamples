package com.sam.generic;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public void method(List<? extends Animal> listSuperAnimal) {

	}

	public void method1(List<Animal> listSuperAnimal) {

	}

	public void method2(Animal animal) {

	}

	public void testMethod() {
		List<? extends Animal> animal = new ArrayList<>();
		List<Dog> dog1 = new ArrayList<>();
		animal = dog1;
		animal.add(new Dog());
		
		//
		List<? super Integer> dogSuper = new ArrayList<>();
		

		
		method(animal);
		method1(animal);

		List<Dog> dog = new ArrayList<>();
		method(dog);
		method1(dog);

		method2(new Animal());
		method2(new Dog());
		
		draw(new Animal());
		draw(new Dog());
		
		draw1(new Animal());
		draw1(new Dog());
	}

	public static void main(String args[]) {
		List<? extends Animal> listAnimal = new ArrayList<>();
		// listAnimal.add
		listAnimal.add(new Dog());

		List<? super Dog> listSuperAnimal = new ArrayList<>();
		// listAnimal.add
		listSuperAnimal.add(new Dog());

		listSuperAnimal.add(new Animal());
	}

	public static <T extends Animal> void draw(T t) {

	}
	public static  void draw1(Animal animal) {
	}
}
