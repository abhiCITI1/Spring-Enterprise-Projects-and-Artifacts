/**
 * 
 */
package org.abhishek.springaop;

import org.abhishek.springaop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abhishek
 *
 */
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ShapeService service = context.getBean("shapeService", ShapeService.class);
		//service.getCircle().setNameandReturn("Client Circle");
		System.out.println("Circle get method called "+ service.getCircle().getName());
		
		
	}

}
