package com.mustafa.july02.lamda_method;

interface Add1
{
	int add(int b);
	int add(int a, int b);
}
public class FunctionalINterface3 {
	public static void main(String[] args) {
		int a = 21;
		Add1 add = b -> b+b;//error
		System.out.println(add.add(a));
	}
}

