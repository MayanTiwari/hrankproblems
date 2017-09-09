package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			//List<Integer> list = Arrays.asList(4, 5, 3, 7, 2);// int n = in.nextInt();
			List<Integer> list = new ArrayList<>();
			int n = 5;
			//int[] a = new int[] { 4, 5, 3, 7, 2 };
			
			
			for(int a_i=0; a_i < n; a_i++){
			        list.add(in.nextInt());
			    	//a[a_i] = in.nextInt();
					
			    }
			
			int pivot = list.get(0);
			List<Integer> left = new ArrayList<>();
			List<Integer> equal = new ArrayList<>();
			List<Integer> right = new ArrayList<>();

			list.forEach(e -> {
				if (e > pivot)
					right.add(e);
				else if (e < pivot)
					left.add(e);
				else
					equal.add(e);
			});
			left.addAll(equal);
			left.addAll(right);
			left.stream().map(e -> e + " ").forEach(System.out :: print);

	}
}
