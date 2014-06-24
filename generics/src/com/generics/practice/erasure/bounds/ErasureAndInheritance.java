package com.generics.practice.erasure.bounds;

public class ErasureAndInheritance {

	
	public static void main(String[] args){
		
/*		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj);*/
		
		Derived1<Derived2> d2 = new Derived1<Derived2>();
		Derived2 obj = d2.get();
		System.out.print(obj);
		d2.set(obj);
	}
	
}
