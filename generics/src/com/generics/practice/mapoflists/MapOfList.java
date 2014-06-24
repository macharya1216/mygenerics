package com.generics.practice.mapoflists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.generics.practice.pets.Cat;
import com.generics.practice.pets.Dog;
import com.generics.practice.pets.Pet;

public class MapOfList {

	public static Map<Person,List<? extends Pet>> petPeople = new HashMap<Person,List<? extends Pet>>();
	static{
	petPeople.put(new Person("Chunni"),Arrays.asList(new Cat("Dhanno"),new Dog("Banno")));
	}
	
	public static void main(String[] args){
		
		System.out.println("People>>"+petPeople.keySet());
		System.out.print("Pets :>>"+petPeople.values());
		
		for(Person person : petPeople.keySet()){
			System.out.print(person+" has");
			for(Pet pet : petPeople.get(person)){
				
				System.out.print("  "+pet);
			}
		}
	}
	
}
