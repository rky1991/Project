package javaPrgrm;

import java.util.Arrays;

public class ReverseHalf {

	public static void reverse(int[] ar, int i, int j) {//i= length/2,j=length-1
		   if(i>j)
		     return;
		   else{
		     int temp = ar[i];
		     ar[i] = ar[j];
		     ar[j] = temp;
		     reverse(ar, ++i, --j);
		   }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,3,6,7,1,8};
		reverse(ar, (ar.length/2), ar.length-1);
		System.out.println(Arrays.toString(ar));

	}

}
