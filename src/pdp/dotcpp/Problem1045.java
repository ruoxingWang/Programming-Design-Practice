package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		int[] copyArr = Arrays.copyOf(arr, 10);
		Arrays.sort(copyArr);
		
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}
}
