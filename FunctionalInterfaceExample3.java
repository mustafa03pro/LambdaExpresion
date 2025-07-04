package com.mustafa.july02.lamda_method;


@FunctionalInterface
interface NIT4{
 int square(int x);
 static int add(int a, int b){
     return a+b;
 }
 static int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class FunctionalInterfaceExample3{
 public static void main(String[] args){
     int a = 25;
     int b = 5;  
     int add = NIT4.add(a,b);
     int sub = NIT4.sub(a,b);
     int mul = NIT4.multiply(a,b);
     int div = NIT4.divide(a,b);
     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
      
     NIT4 sq = (x) -> 
     {
    	 return x*x;
     };
     System.out.print(sq.square(6));
 }
}