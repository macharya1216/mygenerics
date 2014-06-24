package com.generics.practice.fibonacci;

import java.util.*;

class IterableFibonacciComposition implements Iterable<Integer> {
private Fibonacci fib = new Fibonacci();
private int n;
public IterableFibonacciComposition(int count) { n = count; }
public Iterator<Integer> iterator() {
return new Iterator<Integer>() {
public boolean hasNext() { return n > 0; }
public Integer next() {
--n;
return fib.next();
}
public void remove() { // Not implemented
throw new UnsupportedOperationException();
}
};
}


public static void main(String[] args){
	
	for(int i : new IterableFibonacciComposition(18))
		System.out.print(i+" ");
}
}