package com.generics.practice.tuple;
import static com.generics.practice.tuple.Tuple.tuple;

import com.generics.practice.pets.Cat;

public class TupleTest2 {
	  static TwoTuple<String,Integer> f() {
	    return tuple("hi", 47);
	  }
	  static TwoTuple f2() { return tuple("hi", 47); }
	
	  static ThreeTuple<Cat,String,Integer> g() {
	    return tuple(new Cat(), "hi", 47);
	  }
	
	  public static void main(String[] args) {
	    TwoTuple<String,Integer> ttsi = f();
	    System.out.println(ttsi);
	    System.out.println(f2());
	    System.out.println(g());
	   
	  }
	}
