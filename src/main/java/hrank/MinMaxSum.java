package hrank;

import java.util.Scanner;


public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*long[] a = new long[5];
		for (int i = 0; i < 5; i++) {
			a[i] = in.nextLong();
		}
		long min = Long.MAX_VALUE, max = 0;
		for (int i = 0; i < 5; i++) {
			long sum = 0;
			for (int j = 0; j <= 4; j++) {
				if (j != i) {
					sum += a[j];
				}
			}
			if (sum > max)
				max = sum;
			if (sum < min)
				min = sum;
		}
		System.out.println(Long.toString(min) + " " + Long.toString(max));*/
		
		
		// Without using array . Nice solution . 
		 long max, min, sum;
	    sum = max = min = in.nextLong();

	    for(int i=1; i<5;i++){
	        long temp = in.nextLong();
	        sum += temp;
	        if(max>temp){
	            if(min > temp) {
	                min = temp;
	            }
	        } else {
	            max = temp;
	        }
	    }

	    System.out.print((sum -max) + " " + (sum - min));
	

	}
	
	
}
