package com.sam.generic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.relation.RoleList;

import com.sam.generic.Animal;
import com.sam.generic.BaseAnimal;
import com.sam.generic.Dog;

public class GenericSuperTest2 {
	public static void main(String args[]) {
		
		/*
		 * N.B -> Class hierarchy. Animal -> BaseAnimal -> Dog
		 * 
		 */

		// ----------------
		List<Animal> list = new ArrayList<>();
		new GenericSuperTest2().method(list);

		List<BaseAnimal> list2 = new ArrayList<>();
		new GenericSuperTest2().method(list2);
	}

	private void method(List<? super Dog> dogSuper) {
		/*
		 * In main method we are passing "List<Animal>" and "List<BaseAnimal> "
		 * which is legal and both List "Type" are parent of "Dog" .
		 * 
		 * Here in the code below compiler "only allow" "Dog" object which we
		 * can add to "dogSuper", because "always" "Type of List" passed to this
		 * method(method(List<? super Dog> dogSuper)) will be a parent of "Dog" which
		 * says that we can add only "Dog"(subtype) type to "dogSuper"
		 */
		dogSuper.add(new Dog());

	}
}
