package com.generics.practice.genericmethods;

public class GenericMethodsThreeParams {

	public <T, S> void f(T x, S v, GenericMethodsThreeParams t) {
		System.out.println(x.getClass().getName() + ">>"
				+ v.getClass().getName() + ">>" + t.getClass().getName());
	}

	public static void main(String[] args) {

		GenericMethodsThreeParams gm = new GenericMethodsThreeParams();
		gm.f("", 1, gm);

	}
}
