package com.generics.practice.erasure.bounds;

import java.util.HashMap;
import java.util.Map;


interface Factory<T>{
	T create(int arg);
}

class IntegerFactory3 implements Factory<Integer>{
	public Integer create(int arg){
		return new Integer(arg);
	}
}
class Widget3 {
	private final int id;

	Widget3(int ident) {
		id = ident;
	}

	public static class Factory4 implements Factory<Widget1>{
		public Widget1 create(int ar){
			return new Widget1(ar);
		}
	}
}

class FactoryCapture {
Map<String,Factory<?>> factories =
new HashMap<String,Factory<?>>();

	public Object createNew(String factoryname, int arg) {
		Factory<?> f = factories.get(factoryname);
		try {
			return f.create(arg);
		} catch (NullPointerException e) {
			System.out.println("Not a registered factoryname: " + factoryname);
			return null;
		}
	}
public void
addFactory(String factoryname, Factory<?> factory) {
factories.put(factoryname, factory);
}
}
public class E24_FactoryCapture {
public static void main(String[] args) {
FactoryCapture fc = new FactoryCapture();
fc.addFactory("Integer", new IntegerFactory3());
fc.addFactory("Widget", new Widget3.Factory4());
System.out.println(fc.createNew("Integer", 1));
System.out.println(fc.createNew("Widget", 2));
fc.createNew("Product", 3);
}
}