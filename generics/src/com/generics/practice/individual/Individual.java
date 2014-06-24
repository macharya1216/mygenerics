package com.generics.practice.individual;


public class Individual{

private String name;
public Individual(String name) { this.name = name; }
public Individual() {}
public String toString() {
  return getClass().getSimpleName() +
    (name == null ? "" : " " + name);
}

} ///:~

