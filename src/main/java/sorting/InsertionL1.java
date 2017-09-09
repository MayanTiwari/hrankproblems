package sorting;

import java.util.Scanner;

public class InsertionL1 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int n = ar.length;
		int e = ar[n - 1];

		/*
		 * int i = n-2; while(true){ if(ar[i] > e){ ar[i + 1] = ar[i]; } else{
		 * ar[i] = e; break; } i--; printArray(ar); }
		 */

		
		
		for (int i = n - 2; i >= 0; i--) {
			if (ar[i] > e) {
				ar[i + 1] = ar[i];
				 printArray(ar);
			} else {
				ar[i + 1] = e;
				printArray(ar);
				// ar[i] = e;
				break;
			}
			//printArray(ar);
		}

		if (ar[0] > e) {
			ar[0] = e;
			printArray(ar);
		}

	}

	/* Tail starts here */
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int s = in.nextInt();
		// int[] ar = new int[s];
		// for(int i=0;i<s;i++){
		// ar[i]=in.nextInt();
		// }
		/*
		 * int[] ar = new int[] { 2 ,4 ,8 ,12 ,15 ,19 ,21 ,24 ,26 ,29 ,30 ,32
		 * ,35 ,36 ,41 ,44 ,49 ,52 ,57 ,58 ,59 ,64 ,65 ,68 ,73 ,77 ,80 ,82 ,85,
		 * 88 ,93, 97, 101, 105, 108, 111, 115, 118, 122, 127, 130, 131, 132,
		 * 134, 135, 136, 138, 141, 144, 146 ,151, 153, 158, 160, 165, 169, 171,
		 * 176, 179, 184, 187, 190, 194, 197, 200, 205 ,210, 215, 217, 222 ,225
		 * ,230 ,231 ,236 ,239 ,243 ,244 ,246 ,248 ,253 ,254 ,256 ,258 ,262 ,263
		 * ,267, 272 ,274, 277 ,280 ,284 ,285 ,289 ,291 ,295 ,297 ,301 ,305 ,310
		 * ,312 ,279 };
		 */
		int[] ar = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
		insertIntoSorted(ar);
		// printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
