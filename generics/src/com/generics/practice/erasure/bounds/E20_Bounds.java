package com.generics.practice.erasure.bounds;

public class E20_Bounds {
static <T extends Top> void f(T obj) {
obj.a();
obj.b();
// c() is not part of an interface
// obj.c();
}
public static void main(String[] args) {
f(new CombinedImpl());
}
}
