package com.generics.practice.tuple;

import com.generics.practice.pets.Cat;

public class TupleTest {

	class Dog{}
	
		static TwoTuple<String,Integer>f(){
			return new TwoTuple<String,Integer>("hi",47);
		}
		static ThreeTuple<Cat,String,Integer>g(){
			return new ThreeTuple<Cat,String,Integer>(new Cat("bono"),"suki",9);
		}
	
	public static void main(String[] args){
		
		TwoTuple<String,Integer> ttsi = f();
		System.out.println(ttsi);
		
		
	}
}
