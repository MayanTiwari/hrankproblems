package sStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		List<Character> chars = s.chars()
								.mapToObj(e->(char)e)
								.collect(Collectors.toList());
		
	    System.out.println((chars.stream()
			.filter(e -> Character.isUpperCase(e))
			.count()) + 1);
	    
	    //One more way for java 8 :-)
	    System.out.println(((s.chars().filter(e -> Character.isUpperCase(e))).count()) + 1);
	    
	    
		/*Boolean isUpper = false;
		StringBuilder  sb = new StringBuilder();
		for(int i =0; i < s.length() ; i++){
			if(Character.isUpperCase((s.charAt(i)))){
				System.out.println(sb);
				sb = new StringBuilder();
				//sb.append(s.charAt(i));
			}
			sb.append(s.charAt(i));
			//System.out.println(sb);
			if(i == s.length()-1) System.out.println(sb);
		}*/	
		/*Boolean isUpper = false;
		int beginIndex = 0;
		int endIndex = 0;
		//StringBuilder  sb = new StringBuilder();
		for(int i =0; i < s.length() ; i++){
			if(Character.isUpperCase((s.charAt(i)))){
				endIndex = i;
				System.out.println(s.substring(beginIndex, endIndex));
				beginIndex = i +1;
			}
			endIndex++;
			//sb.append(s.charAt(i));
			//System.out.println(sb);
			if(i == s.length()-1) System.out.println(sb);
		}*/
		
	}
}
