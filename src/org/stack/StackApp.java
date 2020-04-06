package org.stack;

import java.util.Scanner;

public class StackApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println(">>");
		StringStack s = new StringStack(sc.nextInt());
		sc.nextLine();

		String ss;
		
		while(true) {
			ss = in("문자열 ");
			if(ss.equals("그만")) break;
			else if(!(s.push(ss))) System.out.println("저장 불가");
			
			
		} 
		for(int i = 0; i<s.capacity();i++) {
			System.out.print(s.pop()+" ");
		}

	
		
		
	}
	
	public static String in(String str) {
		System.out.println(str+">>");
		return sc.nextLine();
	}
	
}