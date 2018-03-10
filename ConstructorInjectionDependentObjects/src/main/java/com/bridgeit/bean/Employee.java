package com.bridgeit.bean;

/**
 * Purpose: This class contains three properties id, name and address(dependent
 * object) ,two constructors and show() method to show the records of the
 * current object including the dependent object. Employee HAS-A Address,The
 * Address class object will be termed as the dependent object.
 * 
 * @author SANA SHAIKH
 *
 */
public class Employee {

	private String id;
	private String name;
	private Address address;

	public Employee() {
		System.out.println("Default constructor..");
	}

	public Employee(String id, String name, Address address) {
		// super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void showAddress() {
		System.out.println("ID:" + id);
		System.out.println("NAme:" + name);
		System.out.println(address);
	}
}
