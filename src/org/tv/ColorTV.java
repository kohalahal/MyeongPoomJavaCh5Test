package org.tv;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int a) {
		super(a);
	}
	public ColorTV(int a, int b) {
		super(a);
		color = b;
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
	
	public int getColor() {
		return color;
	}
	
	
	public void printProperty() {
		System.out.println("size: "+getSize()+"\tcolor: "+color);
	}
}
