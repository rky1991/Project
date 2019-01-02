package javaPrgrm;

import java.util.Arrays;

public class Anagram {
	static public void isAnagram(String str1,String str2) {
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		boolean flag=true;
		if(s1.length()!=s2.length()) {
			flag=false;
		}
		else {
			char[]S1=s1.toLowerCase().toCharArray();
			char[]S2=s2.toLowerCase().toCharArray();
			Arrays.sort(S1);
			Arrays.sort(S2);
			flag=Arrays.equals(S1,S2);
		}
		if(flag) {
			System.out.println(s1 + " and " + s2 +" are anagrams");
		}
		else {
			System.out.println(s1 + " and " + s2 +"are not anagrams");
		}
	}
	
	public static void main(String[] args) {
		isAnagram("keep", "peek");
	}

}
