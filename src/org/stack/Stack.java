package org.stack;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);

}

class StringStack implements Stack {
	private int tos;
	private int capacity;
	String[] e;
	
	public StringStack(int i) {
		capacity = i;
		e = new String[i];
		tos = -1;
	}
	
	public int length() {
		return tos+1;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public String pop() {
		if(tos==-1) return null;
		else return e[tos--];
		
	}
	
	public boolean push(String val) {
		if(tos<capacity-1)	{
			e[++tos] = val;
			return true;
		}
		else return false;
	}
	
}


