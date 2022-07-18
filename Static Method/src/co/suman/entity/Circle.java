package co.suman.entity;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius =radius;
	}
	public void printRadius() {
		double area= Math.PI*radius*radius;
		System.out.println("Area is : "+area);
	}
}
