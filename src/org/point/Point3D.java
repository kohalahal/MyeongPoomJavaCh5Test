package org.point;

public class Point3D extends Point{
	private int z;

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다");
		p.moveUp();
		System.out.println(p.toString()+"입니다");
		p.moveDown();
		p.move(10, 10);;
		System.out.println(p.toString()+"입니다");
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다");
	}
	
	public Point3D(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub	
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub	
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z=z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getX()+"."+getY()+"."+z+"의 점";
	}

}
