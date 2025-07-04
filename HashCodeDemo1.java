package com.mustafa.july02.lamda_method;

import java.util.Objects;

class Customer{
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

public class HashCodeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(111, "scoth");
		Customer c2=new Customer(111, "scoth");
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+":"+c2.hashCode());

	}

}
