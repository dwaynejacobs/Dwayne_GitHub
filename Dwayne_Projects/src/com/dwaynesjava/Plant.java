package com.dwaynesjava;

public class Plant {
	
	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name);

	}

	int years_to_retire() {

		int years_remaining = 72 - age;
		System.out.println("I will retire in " + years_remaining + " years!");
		
		return (years_remaining);
	}
	
	int get_age(){
		return (age);
	}
	
	String get_name() {
		return(name);
	}

}
