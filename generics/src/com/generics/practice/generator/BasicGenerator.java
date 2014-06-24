package com.generics.practice.generator;


// Automatically create a  Generator , given
// a class with a default(no-arg) constructor
public class BasicGenerator<T> implements Generator<T> {

	private Class<T> type;
	public BasicGenerator(Class<T> type){this.type = type;}
	@Override
	public T next() {
		try{
			return type.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	// Produce a default generator given a type token: 
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
	
	
	
}
