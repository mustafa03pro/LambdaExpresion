package com.mustafa.july02.lamda_method;


@FunctionalInterface1
interface Str
{
	int methodStr(String str);
}
public class FunctionalInterface4 {
	public static void main(String[] args) {
		Str str = (String s) -> "2";//errror type mismatch because method is int
		System.out.println(str.methodStr("2"));
	}
}
