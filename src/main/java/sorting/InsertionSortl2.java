package sorting;

import java.util.Scanner;

import common.Utils;

public class InsertionSortl2 {

	public static void insertionSortPart2(int[] ar) {
		int n = ar.length;
		for(int i= 0; i < ar.length ; i++){
			for(int j = i+1 ; j >=0; j--){
				if(ar[j] < ar[i]) Utils.exch(ar, i, j);
			}
			printArray(ar);
		}
		
	}

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//int s = in.nextInt();
		int[] ar = new int[] {1 ,4 ,3 ,5 ,6 ,2};
		/*for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}*/
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
