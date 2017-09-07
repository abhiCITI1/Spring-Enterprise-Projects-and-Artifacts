package org.abhishek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
	private Point centre;
	
	public Circle(Point center)
	{
		this.centre = center;
	}
	
	public Circle()
	{
		
	}
	
	
	public Point getCentre() {
		return centre;
	}
	@Autowired
	public void setCentre(Point centre)
	{
		this.centre=centre;
	}


	public void draw()
	{
		System.out.println("Center of the circle is : (" + getCentre().getX() + "," + getCentre().getY() + ")");
	}

}
