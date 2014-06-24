package com.generics.practice.generator;

import java.util.Iterator;
import java.util.Random;
import com.generics.practice.hotdrinks.Coffee;
import com.generics.practice.hotdrinks.Latte;
import com.generics.practice.hotdrinks.Mocha;

public class CoffeeGenerator  implements Generator<Coffee>,Iterable<Coffee>{

	private Class<?>[] types = {Latte.class,Mocha.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator(){}
	
	private int size = 0;
	public CoffeeGenerator(int sz){size = sz;}
	
	@Override
	public Coffee next() {
		try{
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
		count--;
		return CoffeeGenerator.this.next();
		}

		@Override
		public void remove() {
		throw new UnsupportedOperationException();	
		}
		
	}
	
	public static void main(String[] args){
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i =0;i<3;i++)
			System.out.println(gen.next());
		for(Coffee c: new CoffeeGenerator(5))
			System.out.println(c);
	
	}
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}

}
