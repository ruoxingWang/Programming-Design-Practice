package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}
}
