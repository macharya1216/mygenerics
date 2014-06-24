package com.generics.practice.erasure.bounds;

public class E22_InstantiateGenericType2 {
	public static void main(String[] args) {
		ClassAsFactory1<Employee> fe = new ClassAsFactory1<Employee>(
				Employee.class);
		Employee emp = fe.create(1);
		if (emp == null)
			System.out.println("Employee cannot be instantiated!");
		ClassAsFactory1<Integer> fi = new ClassAsFactory1<Integer>(Integer.class);
		Integer i = fi.create(0);
		if (i == null)
			System.out.println("Integer cannot be instantiated!");
	}
}
