package com.generics.practice.fibonacci;

import java.util.Iterator;

public class IterableFibonacciInheritance extends Fibonacci implements Iterable<Integer>{

	private int n;
	public IterableFibonacciInheritance(int count){n = count;}
	
	public static void main(String[] args){
		
		for(int i : new IterableFibonacciInheritance(18))
			System.out.print(i+" ");
	}


	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>(){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
			return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacciInheritance.this.next();
			}

			@Override
			public void remove() {
			throw new UnsupportedOperationException();
				
			}
			
		};
	}
	

}
