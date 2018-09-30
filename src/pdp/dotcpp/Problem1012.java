package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1012 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = sc.nextLine();
		int digit = 0;
		int letter = 0;
		int others = 0;
		int space = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				digit++;
			else if (Character.isLetter(s.charAt(i)))
				letter++;
			else if (s.charAt(i) == ' ')
				space++;
			else
				others++;

		}
		System.out.println(letter + " " + digit + " " + space + " " + others);
	}
}