package com.generics.practice.bounds;

import java.awt.Color;

class Solid<T extends Dimension & HasColor & Weight>{
	
	T item;
	Solid(T item){this.item = item;}
	T getItem(){return item;}
	java.awt.Color color() {return item.getColor();}
	int getX() {return item.x;}
	int getY() {return item.y;}
	int getZ() {return item.z;}
	int weight(){return item.weight();}
}

class Bounded extends Dimension implements HasColor,Weight{

	public int weight() {return 0;}
	public Color getColor() {return null;}
}


public class BasicBounds {

	public static void main(String[] args){
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getX();
		solid.weight();
	}
	
}
