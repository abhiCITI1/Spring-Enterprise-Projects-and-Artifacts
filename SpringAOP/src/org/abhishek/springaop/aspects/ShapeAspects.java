package org.abhishek.springaop.aspects;

import org.abhishek.springaop.dto.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ShapeAspects {
	
	@Pointcut("execution(public * org.abhishek.springaop.dto.*.get*(..))")
	public void allGettersPointcuts(){}
	
	@Pointcut("within(org.abhishek.springaop.dto.Circle)")
	public void allCircleMethodPointcuts(){}
	
	@Before("allGettersPointcuts()")
	public void loggingAdvice(JoinPoint jp)
	{
		System.out.println("Before advice called at join point "+ jp.toString());
	}
	
	
	@Before("allCircleMethodPointcuts()")
	public void cachingAdvice(JoinPoint jp)
	{
		System.out.println("Caching advice called at join point "+jp.toString() + "" + (Circle)jp.getTarget());
	}
	
	@Before("args(name)")
	public void getArgumentsPassedAdvice(String name){
		
		System.out.println("Arguments passed in the set method of shapes "+ name);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returningName")
	public void afterReturningAdvice(String name,String returningName)
	{
		System.out.println("String arg setter method called with value "+ name + " and value is "+returningName);
	}
	
	@Around("allGettersPointcuts()")
	public Object checkNameAroundAdvice(ProceedingJoinPoint pjp)
	{
		Object result = null;
		try
		{
			System.out.println("Before the target method is executed");
			result = pjp.proceed();
			System.out.println("After the target method is executed and returned value -After returning");
		}
		catch(Exception e){
			
			System.out.println("Exception caught while exceuting the target onject - After throwing");
		}
		System.out.println("After finally");
		return result; 
		
		
	}
	
	
	
	
	
	

}
