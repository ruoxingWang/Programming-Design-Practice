package pdp.xtu.exam_id_191;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String regex = "[+|-|=]";
		int sum = 0;
		String exp = cin.nextLine();
		String[] str = exp.split(regex, 3);
		for(int i = 0;i < str.length;i++){
			System.out.println(str[i]);
		}
	}
}