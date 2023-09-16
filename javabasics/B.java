package javabasics;

public class B extends A {
int num1=10000;
public void dothis() {
	System.out.println("From class B "+ num1 );
}
public void abc() {
	super.dothis();
	System.out.println(num1);
	System.out.println(super.num1);
}
}
