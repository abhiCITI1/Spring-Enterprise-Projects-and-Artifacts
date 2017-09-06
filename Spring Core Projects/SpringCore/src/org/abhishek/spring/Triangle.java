package org.abhishek.spring;

import java.util.List;

public class Triangle implements Shape{
	
	/*
	 * private Point pointA;
	private Point pointB;
	private Point pointC;	
	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		System.out.println("PointA (" + getPointA().getX() + ", "+ getPointA().getY()+")");
		System.out.println("PointB (" + getPointB().getX() + ", "+ getPointB().getY()+")");
		System.out.println("PointC (" + getPointC().getX() + ", "+ getPointC().getY()+")");
	}
	 * */
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point p:points)
		{
			System.out.println("Point : ("+p.getX() + "," + p.getY() + ")");
		}
	}
	
	
	
}
