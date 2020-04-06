package org.cvt;

import java.util.Scanner;

abstract class Converter {
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+"을"+getDestString());
		System.out.println(getSrcString()+"입력");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println(res+" "+getDestString());
		sc.close();
	}

}
