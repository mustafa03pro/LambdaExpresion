package com.mustafa.july02.lamda_method;


@FunctionalInterface
interface NIT9
{	
	int myInterface(int a);
}

@FunctionalInterface
interface NewInterface
{
	void alpha(String a);
}

public class Java1 {
	public static void main(String[] args) {
		NIT9 nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}
