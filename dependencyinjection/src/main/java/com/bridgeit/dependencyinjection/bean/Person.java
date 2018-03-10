package com.bridgeit.dependencyinjection.bean;

public class Person {

	int x;
	Address addresss;

	/*public Person(int x) {
		this.x = x;
System.out.println(""+x);
	}*/

	public Address getAddresss() {
		return addresss;
	}

	public void setAddresss(Address addresss) {
		this.addresss = addresss;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
