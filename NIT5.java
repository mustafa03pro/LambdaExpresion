package com.mustafa.july02.lamda_method;


@FunctionalInterface
interface NIT5
{
	String myInterface(String a);
	default void nit() 
	{
		
	}
	default int newInterface(int a) 
	{
		return a;
	}
}
