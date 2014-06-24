package com.generics.practice.innerclasses;

import com.generics.practice.generator.Generator;

public class Customer {

	private static long counter = 1;
	private final long id = counter++;
	private Customer(){}
	public String toString(){return "Customer "+id;}
	//A method to produce Generator objects. 
	public static Generator<Customer> generator(){
		return new Generator<Customer>(){
			public Customer next(){return new Customer();}
		};
	}
	
}

class Teller{
	
	private static long counter=1;
	private final long id= counter++;
	private Teller(){}
	public String toString(){return "Teller "+id;}
	
	// A single generator 
	public static Generator<Teller> generator = new Generator<Teller>(){
		public Teller next(){ return new Teller();}
		
	};
	
}

