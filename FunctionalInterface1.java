package com.mustafa.july02.lamda_method;

	interface Add
	{
		int add(int b);
	}
	public class FunctionalInterface1 {
		
		public static void main(String[] args)
		{
			int a = 10;
			
			Add add = (int b) -> b;
			System.out.println(add.add(a));
		}
	}




