package sStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int len = in.nextInt();
		// String s = in.next();
		String s = "SOSZYS";
		Map<Integer, Character> cMap = new HashMap<>();
		cMap.put(0, 'S');
		cMap.put(1, 'O');
		cMap.put(2, 'S');
		// List<Character> list = new ArrayList<>();
		int temp = -1;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i > 2) {
				temp = 0;
			} else {
				temp++;
			}
			if (s.charAt(i) != cMap.get(temp)) {
				System.out.println(s.charAt(i));
				count++;
			}
		}
		System.out.println(count);
	}
}
