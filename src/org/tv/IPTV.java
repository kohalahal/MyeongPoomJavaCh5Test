package org.tv;

public class IPTV extends ColorTV {
	private String add;

	public IPTV(String a, int b, int c) {
		super(b, c);
		add=a;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		System.out.print(add+getSize()+getColor());
	}
	
	public static void main(String[] args) {
		IPTV i = new IPTV("192.1.1.2", 32, 2048);
		i.printProperty();
	}

}
