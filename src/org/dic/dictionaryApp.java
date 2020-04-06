package org.dic;

public class dictionaryApp {
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황재문", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "씨쁠쁠");
		System.out.println("이재문값은 "+dic.get("이재문"));
		System.out.println("황재문값은 "+dic.get("황재문"));
		dic.delete("황재문");
		System.out.println("황재문값은 "+dic.get("황재문"));

	}

}
