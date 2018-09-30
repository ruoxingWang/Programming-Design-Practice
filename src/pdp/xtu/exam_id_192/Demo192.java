package pdp.xtu.exam_id_192;

import java.util.Scanner;

public class Demo192 {
	private static String regex = "[^47]+";
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("12356".matches(regex));
	}
}
