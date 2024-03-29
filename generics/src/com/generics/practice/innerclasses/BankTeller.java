package com.generics.practice.innerclasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import com.generics.practice.generator.Generators;

public class BankTeller {

	public static void serve(Teller t,Customer c){
		System.out.println(t +"Serves "+c);
	}
	
	public static void main(String[] args){
		
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c :line){
			serve(tellers.get(rand.nextInt(tellers.size())),c);
		}
	}
	
	
}
