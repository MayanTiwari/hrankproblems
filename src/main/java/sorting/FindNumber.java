package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //List<Integer> list= new ArrayList<Integer>();
        int v = in.nextInt();
	    int n = in.nextInt();
	    int[] a = new int[n];
	    for(int a_i=0; a_i < n; a_i++){
	       // list.add(in.nextInt());
	    	a[a_i] = in.nextInt();
	    }
        for(int i =0 ; i < n ; i ++){
            if(a[i] == v){
                System.out.println(i);
                break;
            }
        }
      /*  list.forEach(item ->
        {
        	if(item == v) System.out.println(item.);
        }//
        );*/
       //System.out.println(list.stream().filter(item -> item == v).findFirst());
        
    }
}
