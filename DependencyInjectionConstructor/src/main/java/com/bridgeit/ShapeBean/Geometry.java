package com.bridgeit.ShapeBean;

import com.bridgeit.ShapeInterface.Shape;

/**
 * Geometry and Circle class in which the object of Circle class is injected as
 * a constructor argument.
 * 
 * @author SANA SHAIKH
 *
 */
public class Geometry implements Shape {

	// Refrence variable of Interface
	private Shape shape;

	// Injecting circle object via Constructor
	public Geometry(Shape shape) {

		this.shape = shape;
	}
	
	public void drawShape() {
		shape.draw();
	}

	public void draw() {

	}
}
