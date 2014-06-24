package com.generics.practice.generator;

import java.util.ArrayList;
import java.util.List;

public class Sequence<T> {
	
	public Sequence(int i,T e){
		List<T> list = new ArrayList<T>();
		for(int n = 0; n <=i;n++){
			list.add(e);
		}
		 
	}
}
