package com.mustafa.july02.lamda_method;
import java.util.function.*;


public class Java2 {
	public static void main(String[] args) {
		Consumer<Integer> value = (a) -> System.out.println(a*3);
		value.accept(5);
	}
}
