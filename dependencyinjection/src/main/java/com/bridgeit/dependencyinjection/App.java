package com.bridgeit.dependencyinjection;

import com.bridgeit.dependencyinjection.bean.Address;
import com.bridgeit.dependencyinjection.bean.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Person person = new Person();
     Address addresss = new Address();
     person.setX(10);
     person.setAddresss(addresss);
     
    }
}
