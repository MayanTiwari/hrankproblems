package hrank;

import java.util.Scanner;

public class CircularArrayRotation {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        int r = k%n;
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        // brute force solution for circular operation.
	        // circular logic 1,2,3 ==> 3,1,2
	        /*for(int kk = 1; kk <= k; kk++){
	            int temp = a[n-1];
	            for(int i = n-1; i > 0 ; i--){
	                a[i] = a[i-1];
	            }    
	            a[0] = temp;
	        }*/
	        
	        for(int a0 = 0; a0 < q; a0++){
	            int m = in.nextInt();
	            if(m-r >=0){
	            	System.out.println(a[m-r]);
	            }else
	            	System.out.println(a[m-r + a.length]);
	        }
	    }
}
