package com.bridgeit.SpringDemo.InterfaceImplementation;

import com.bridgeit.SpringDemo.Interface.Language;

public class English implements Language{

	public String getGreeting() {

		return "Hello";
	}

	public String getBye() {

		return "Bye";
	}
}
