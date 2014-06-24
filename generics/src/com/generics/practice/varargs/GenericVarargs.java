package com.generics.practice.varargs;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {

	
	public static <T> List<T> makeList(T... args){
		List<T> result = new ArrayList<T>();
		for(T item :args){
			result.add(item);
		}
		return result;
	}
	
	public static void main(String [] args){
		
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("ABCDEFGHIJKL".split(""));
		System.out.println(ls);
		
		List<Integer> in = makeList(1,2,3);
		System.out.println(in);
	}
}
