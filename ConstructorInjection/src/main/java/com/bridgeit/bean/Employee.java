package com.bridgeit.bean;

/**
 * This class containing two fields id and name. There are four constructors and
 * one method in this class.
 * 
 * @author SANA SHAIKh
 *
 */
public class Employee {

	private int id;
	private String name;

	// Generate default constructor of super class
	public Employee() {
		System.out.println("Default constructor..");
	}

	// Parameterized constructor for id
	public Employee(int id) {
		this.id = id;
	}

	// Parameterized constructor for name
	public Employee(String name) {
		this.name = name;
	}

	// generating constructor of fields
	public Employee(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	// Method to show Employee details
	public void show() {
		System.out.println("Id:" + id + " " + "Name:" + name);
	}
}
