package org.abhishek.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, InitializingBean, DisposableBean{
	
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
	/*@Autowired
	public void setCentre(Point centre)
	{
		this.centre=centre;
	}
*/
	@Resource(name="centerPoint")
	public void setCentre(Point centre)
	{
		this.centre = centre;
	}

	public void draw()
	{
		System.out.println("Center of the circle is : (" + getCentre().getX() + "," + getCentre().getY() + ")");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before Bean is destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After bean is instantiated");
	}
	
	
	
	
	
	
	
	
	

}
