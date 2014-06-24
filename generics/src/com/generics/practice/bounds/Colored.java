package com.generics.practice.bounds;

class Colored<T extends HasColor>{
	T item;
	Colored(T item){this.item = item;}
	T getItem(){return item;}
	
	java.awt.Color color(){return item.getColor();}
}