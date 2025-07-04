package com.mustafa.july02.lamda_method;
import java.util.function.*;


public class Java4 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println(a.toLowerCase());
		value.accept("NareshIT");
	}
}
