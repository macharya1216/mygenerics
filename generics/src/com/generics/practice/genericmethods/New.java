package com.generics.practice.genericmethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.generics.practice.generator.Sequence;

public class New {

	public static <K,V> Map <K,V> map(){
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	
	public static void main(String [] args){
	
		
		Set<Sequence<String>> set = New.set();
		set.add(new Sequence<String>(5,"boo"));
		System.out.println(set);
		
	}
		
}
