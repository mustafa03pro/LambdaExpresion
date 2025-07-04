package com.mustafa.july02.lamda_method;


//@FunctionalInterface
@FunctionalInterface1
interface Cube
{
	int cube(int b);
}
public class FunctionalInterface2 {
	
	public static void main(String[] args) {
		int a = 21;
		
		Cube cube = b -> b*b*b;
		System.out.println(cube.cube(a));
	}
}
