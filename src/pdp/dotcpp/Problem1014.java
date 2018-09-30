package pdp.dotcpp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class Problem1014 {
	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int n = (int)st.nval;
		BigInteger bi = new BigInteger("0");
		for(int i = 1; i <= n; i++) {
			bi = bi.add(factor(i));
		}
		System.out.println(bi);
	}
	public static BigInteger factor(int n){
		if(n == 0)
			return new BigInteger(""+1);
		BigInteger bi = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			bi = bi.multiply(new BigInteger(""+i));
		}
		return bi;
	}
}
