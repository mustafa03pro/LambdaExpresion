package com.mustafa.july02.lamda_method;
//import java.util.*;
import java.util.function.Predicate;


public class FunctionalInterfaceExample6{
	public static void main(String[] args) {
		Predicate<Integer> grater = a -> a >15;
		
		Predicate<Integer> less = a -> a <10;
		
		boolean bool = grater.test(20);
		boolean bool1 = less.test(5);
		System.out.println(bool);
		System.out.println(bool1);		
		
	}
}
