package com.mustafa.july02.lamda_method;


@FunctionalInterface
interface NIT7
{
	String myInterface(String a); //abstract method
	@Override
	String toString(); //Object class method
	void wait();//error because of no more than one abstract method
	void notify();
	
}
