package com.mustafa.july02.lamda_method;
import java.util.function.Predicate;


public class FunctionalInterfaceExample7{
	public static void main(String[] args) 
	{
		String str[]= {"Java","Python","Naresh","IT"};
		
		Predicate<String> prediacte = p -> p.endsWith("va");
		for(String s: str) 
		{
			if(prediacte.test(s))
				System.out.println(s);
		}
	}
}
