package com.sam.classTest;

public class Car extends Vehicle{ 
	
	   public void move(){ 
	      System.out.println("Car is moving"); 
	   } 

	   public static void main(String[] args){ 
	      Vehicle vehicle = new Car(); 
	      vehicle.move(); 
	   } 
	}  