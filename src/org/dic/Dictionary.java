package org.dic;

public class Dictionary extends PairMap {
	private int sum = 0;
	
	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}
	

	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for(int i = 0; i<keyArray.length; i++) {
			if(keyArray[i]!=null&&keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		int idx=-1;
		boolean flag = true;
		for(int i = 0; i<keyArray.length; i++) {
			if(keyArray[i]!=null&&keyArray[i].equals(key)) {
				valueArray[i]=value;
				flag = false;
				break;
			} 
		}
		if(sum==keyArray.length) flag = false;
		if(flag) {
			for(int i = 0; i<keyArray.length; i++) {
				if(keyArray[i]==null) { idx = i; break; }
			}  keyArray[idx]=key; valueArray[idx]=value; sum++;
		}
	}  
		

	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		String s = null;
		for(int i = 0; i<keyArray.length; i++) {
			if(keyArray[i]!=null&&keyArray[i].equals(key)) {
				keyArray[i]=null;
				s = valueArray[i];
				valueArray[i] = null;
				sum--;
				return s;
			}
		}
		return null;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return sum;
	}

}

