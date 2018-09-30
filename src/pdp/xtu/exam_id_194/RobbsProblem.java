package pdp.xtu.exam_id_194;

/*
 * ��Ŀ����
Robb��֪���׳�n!��mλ������ʲô��
����
��һ����һ������T,(1��T��10000) 
ÿ��һ��������Ϊ2������n,m,0��n��1000,1��m��log10n!+1
���
ÿ�����һ�������Ľ��
��������
3
5 1
5 2 
5 3
 */
import java.math.BigInteger;
import java.util.Scanner;

public class RobbsProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int simple = 0;simple < N; simple++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String stringBigInteger = factor(n).toString();
			int len = stringBigInteger.length();
			System.out.println(stringBigInteger.charAt(len - m));
		}

	}
	private static BigInteger factor(int n) {
		BigInteger result = new BigInteger("1");
		for(int i = 1; i <= n; i++){
			result = result.multiply(new BigInteger("" + i));
		}
		return result;
	}
}
