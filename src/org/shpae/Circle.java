package org.shpae;

public class Circle implements Shape {
	private int r;
	public Circle(int r) {
		this.r=r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+r+"인 원입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r*r*PI;
	}
	
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
	

}

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
