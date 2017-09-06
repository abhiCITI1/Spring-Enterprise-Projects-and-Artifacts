package org.abhishek.spring;

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
	
	/*public void setCentre(Point centre)
	{
		this.centre=centre;
	}*/


	public void draw()
	{
		System.out.println("Center of the circle is : (" + getCentre().getX() + "," + getCentre().getY() + ")");
	}

}
