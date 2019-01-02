package javaPrgrm;

import java.util.Arrays;

public class ReverseLstHalf {

	public static void main(String[] args) {
		int a[]= {3,5,6,7,8,9};
		int b[]=new int [a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			b[j]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
