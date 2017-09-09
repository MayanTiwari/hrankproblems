package hrank;

import java.util.Scanner;

public class PdfViewer {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26; 
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        int tallest = 0;
        int test =0; 
        for(int i =0 ; i < word.length();i++){
			int heightOfChar = h[word.charAt(i)-97];
            if(tallest < heightOfChar)
            	tallest = heightOfChar;
        }
        System.out.println(tallest * word.length());
    }
}
