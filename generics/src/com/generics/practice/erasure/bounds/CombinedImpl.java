package com.generics.practice.erasure.bounds;

class CombinedImpl implements Top {
public void a() { System.out.println("Top::a()"); }
public void b() { System.out.println("Top::b()"); }
public void c() {
System.out.println("CombinedImpl::c()");
}
}
