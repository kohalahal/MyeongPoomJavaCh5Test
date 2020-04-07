package org.shpae;

class Rect implements Shape {
	private int x;
	private int y;
	public Rect(int i, int j) {
		// TODO Auto-generated constructor stub
		x=i;
		y=j;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"X"+y+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}
	
}

public class Oval implements Shape {
	private int x;
	private int y;
	public Oval(int i, int j) {
		// TODO Auto-generated constructor stub
		x=i;
		y=j;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"X"+y+"사각형에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,20);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i<list.length; i++) list[i].redraw();
		for(int i = 0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}

}
