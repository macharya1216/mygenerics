package com.generics.practice.erasure.bounds;

import java.util.HashMap;
import java.util.Map;

class Building{}
class House extends Building{}

public class ClassTypeCapture {

	//Class<T> kind;
	Map<String,Class<?>> types =
			new HashMap<String,Class<?>>();
	
	/*public ClassTypeCapture(Class<T> kind){
		this.kind = kind;
	}*/
	
//	public boolean f(Object arg){
//		return kind.isInstance(arg);
//	}
	
	public Object createNew(String typename) {
		Class<?> cl = types.get(typename);
		try {
		return cl.newInstance();
		} catch(NullPointerException e) {
		System.out.println("Not a registered typename: " + typename);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		return null;
		}
	
	public void addType(String typename, Class<?> kind) {
		types.put(typename, kind);
		}
	
	public static void main(String[] args){
		ClassTypeCapture ctt1 = new ClassTypeCapture();
		ctt1.addType("Building", Building.class);
		ctt1.addType("House", House.class);
		//ctt1.addType("Product", Product.class);
		System.out.println(ctt1.createNew("Building").getClass());
		System.out.println(ctt1.createNew("House").getClass());
		//ctt.createNew("Product");
		ctt1.createNew("Car");
		
		
		/*ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));*/
		
		
		
		
	}
	
}
