package org.abhishek.springaop.service;

import org.abhishek.springaop.dto.Circle;
import org.abhishek.springaop.dto.Triangle;
import org.springframework.beans.factory.annotation.Autowired;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
