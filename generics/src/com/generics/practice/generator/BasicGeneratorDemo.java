package com.generics.practice.generator;

public class BasicGeneratorDemo {

	
	public static void main(String[] args){
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i<5;i++)
			System.out.println(gen.next());
	
		Generator<CountedObject> gen1 = new BasicGenerator<CountedObject>(CountedObject.class);
		for(int i = 0; i<5;i++)
			System.out.println(gen1.next());
		
	}
}
