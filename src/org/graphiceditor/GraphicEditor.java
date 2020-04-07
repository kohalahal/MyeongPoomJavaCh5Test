package org.graphiceditor;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}


class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");	
	}
	
}

class Rect extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
	
}


class Circle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}



public class GraphicEditor extends Shape {
	
	static Scanner sc = new Scanner(System.in);
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}

		

	
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		int i = 0;
		System.out.println("실행");
		while(true) {
			switch(mainMenu()) {
			case 1:
				switch(selectMenu()) {
				case 1:s[i++] = new Line();break;
				case 2:s[i++] = new Rect();break;
				case 3:s[i++] = new Circle();break;
				}break;
			case 2:
				int x = selectIdx();
				if(x<i-1&&x>-1) {
					s[i-1]=null;
					i--;
				} else {System.out.println("삭제할 수 없습니다.");}
				break;
			case 3:
				for(int a = 0; a<i; a++) {
					s[a].draw();
				}
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}
	
	public static int mainMenu() {
		System.out.println("1.삽입 2.삭제 3.모두보기 4.종료>>");
		return Integer.parseInt(sc.nextLine());
	}
	
	public static int selectMenu() {
		System.out.println("1.라인 2.렉트 3.써클>>");
		return Integer.parseInt(sc.nextLine());
	}
	
	public static int selectIdx() {
		System.out.println("삭제할 도형 위치>>");
		return Integer.parseInt(sc.nextLine());
	}

}
