package org.point;

public class ColorPoint extends Point {
	private String color;
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public ColorPoint(int x, int y, String c) {
		super(x, y);
		color = c;
	}
	
	public void setXY(int a, int b) {
		super.move(a, b);
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color+"색의 "+getX()+"."+getY()+"점";
	}
	

}
