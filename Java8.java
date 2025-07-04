package com.mustafa.july02.lamda_method;


interface NIT8
{
	public int myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NIT8 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}

