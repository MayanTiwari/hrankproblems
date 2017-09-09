package hrank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// String time = in.next();
		String time = "07:05:45PM";
		StringBuilder out = new StringBuilder(time);
		if (!time.isEmpty()) {
			Integer temp = 0;
			if (time.substring(8, 10).equals("PM")) {
				temp = Integer.parseInt(time.substring(0, 2));
				if (temp != 12)
					temp = Integer.parseInt(time.substring(0, 2)) + 12;

				out.replace(0, 2, Integer.toString(temp));
			} else if (time.substring(8, 10).equals("AM")) {
				temp = Integer.parseInt(time.substring(0, 2));
				if (temp == 12)
					out.replace(0, 2, "00");
			}
			out.setLength(out.length() - 2);
			System.out.println(out);
		}
	}
}
