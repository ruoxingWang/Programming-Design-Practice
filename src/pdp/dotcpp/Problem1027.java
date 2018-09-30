package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int m = sc.nextInt();
		int n = sc.nextInt();
		BigInteger bi = new BigInteger(""+m).gcd(new BigInteger(""+n));
		System.out.println(bi + " " + new BigInteger(""+m).multiply(new BigInteger(""+n)).divide(bi));
	}
}
