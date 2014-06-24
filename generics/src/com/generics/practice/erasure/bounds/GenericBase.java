package com.generics.practice.erasure.bounds;

public class GenericBase<T> {

	
	private T element;
	public void set(T arg){ 
		System.out.println("Setting to>>"+arg);
		element = arg;}
	public T get(){return element;}
}
