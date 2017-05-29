package com.sam.generic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sam.generic.Animal;
import com.sam.generic.BaseAnimal;
import com.sam.generic.Dog;

public class GenericExtendTest {
	public static void main(String args[]) {

		/*
		 * N.B -> Class hierarchy. Animal -> BaseAnimal -> Dog
		 * 
		 */

		// ----------------
		List<BaseAnimal> bAnimal = Arrays.asList(new BaseAnimal());
		bAnimal.add(new Dog());
		new GenericExtendTest().method(bAnimal);

		List<Dog> dog = Arrays.asList(new Dog());
		new GenericExtendTest().method(dog);
	}

	private void method(List<? extends Animal> animalExtends) {

		// Illegal, we can not add anything because generic type of "List"
		// passed to this
		// method is unknown we may pass a "List" of type "BaseAnimal" or "Dog"
		// etc. Since the "type" of referred object is unknown the compiler does
		// not allow to add .
		// Suppose we pass "List<Dog>" and then try to add "new BaseAnimal()"
		// which is completely wrong,
		// because we trying to add "parent" type where List type is "child"
		animalExtends.add(new BaseAnimal());

		//
		List<? extends Animal> animalExtends1 = new ArrayList<BaseAnimal>();

		// same logic as above. listNum1 can refer to any List of type that
		// extends Number.
		animalExtends.add(new Dog());
	}

}
