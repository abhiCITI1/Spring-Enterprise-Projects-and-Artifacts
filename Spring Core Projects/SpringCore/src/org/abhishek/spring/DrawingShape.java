package org.abhishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring2.xml");
		Shape t = (Shape) context.getBean("triangle");
		Shape c = (Shape) context2.getBean("circle");
		t.draw();
		c.draw();

	}

}
