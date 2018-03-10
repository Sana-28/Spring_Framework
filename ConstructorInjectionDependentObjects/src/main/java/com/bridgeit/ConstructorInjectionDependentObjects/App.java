package com.bridgeit.ConstructorInjectionDependentObjects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.bean.Employee;

/**
 * Purpose: This class gets the bean from the beans.xml file and calls the show
 * method.
 * 
 * @author SANA SHAIKH
 *
 */
public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee = (Employee) beanFactory.getBean("employeeBean");
		employee.showAddress();
	}
}
