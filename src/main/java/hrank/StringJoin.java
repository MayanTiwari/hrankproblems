package hrank;

import java.util.StringJoiner;

public class StringJoin {
	public static void main(String args[]) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		System.out.println(sj.toString());
	}

}
