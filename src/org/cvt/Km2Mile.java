package org.cvt;

public class Km2Mile extends Converter{
	
	String SrcString ="Km";
	String DestString = "Mile";
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
		
	}
	
	public Km2Mile(double d) {
		ratio=d;
		
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return SrcString;
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return DestString;
	}

}
