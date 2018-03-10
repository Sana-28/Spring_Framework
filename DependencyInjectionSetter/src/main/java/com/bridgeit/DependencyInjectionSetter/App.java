package com.bridgeit.DependencyInjectionSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.ShapeBean.Geometry;

/**
 * Purpose: This program object is injected via setter method. The following is
 * an example of Geometry and Rectangle class in which the object of Rectangle
 * class is injected using setter method.
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Geometry geometry1 = applicationContext.getBean("geometryBean", Geometry.class);
		geometry1.drawShape();
	}
}
