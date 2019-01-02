package javaPrgrm;

import java.util.Scanner;

public class AirthmaticProgression {
	  
	
	public static int lastTerm(int a,int d,int n) {
        
		 return a+(n-1)*d;
        
    }
	
	
    public static void main(String[] args) {
    	 int a1, d1, n1;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first term of A.P");
         a1 = sc.nextInt();
         System.out.println("Enter difference");
         d1 = sc.nextInt();
         System.out.println("Enter the number of terms");
         n1 = sc.nextInt();
         
         int ser=lastTerm(a1,d1,n1);
         for(int i=0;i<=10;i++) {
         System.out.println(ser);
         }
    

}
    

}
/*
 * class Series {
    public static void main(String args[]) {
        int a, d, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term of A.P");
        a = sc.nextInt();
        System.out.println("Enter difference");
        d = sc.nextInt();
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        Series s1 = new Series();
        s1.lastTerm();
    }

    public int lastTerm(int s) {
        int a, d, n;
        s = a + (n - 1) * d;
        return s;
    }
}
 * 
 * */
 