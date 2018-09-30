package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String[] arr = new String[3];
		for (int i = 0; i < 3; i++)
			arr[i] = sc.nextLine();
		Arrays.sort(arr);
		for (int i = 0; i < 3; i++)
			System.out.println(arr[i]);
	}
}
