package com.generics.practice.linkedstack;

import java.util.ArrayList;

public class LinkedStack<T> {

	private static class Node<U>{
		
		U item;
		Node<U> next;
		Node(){item = null; next = null;}
		Node(U item , Node<U> next){
			this.item = item ; 
			this.next = next;
		}
		boolean end(){return item == null && next == null;}
	}
	
	private Node<T> top = new Node<T>();
	public void push(T item){
		top = new Node(item,top);
	}
	public T pop(){
		T result = top.item; 
		if(!top.end())
			top = top.next;
		return result;
	}
	
	public static void main(String[] args){
		LinkedStack<String> lss =  new LinkedStack<String>();
	
		for(String s : "Mohit ismy name and i am here".split(" "))
			lss.push(s);
		
		String s;
		while ((s = lss.pop()) != null)
			System.out.println(s);
			
		LinkedStack<Integer> integerstack =  new LinkedStack<Integer>();

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);
		intArray.add(5);
		
		for(Integer integer : intArray)
			integerstack.push(integer);
		
		Integer i;
		while ((i = integerstack.pop()) != null)
			System.out.println(i);
		
		
		
		
		
	}
	
	
}
