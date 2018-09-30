package pdp.xtu.exam_id_195;
/*
 * ��Ŀ����
������1*2�Ĺ��ƣ�ȥ��n*3�ĵذ壬���ƿ������źͺ��ŷţ��������ص������������ذ�һ���ж����ֲ�ͬ���̷���
����
ÿ������һ������n,(1��n��1,000),���nΪ0��ʾ�����������������������ô������ڽ�����ܴܺ�������Ҫ�������100,003ȡģ��
���
ÿ�����һ�������Ľ����
��������
1
2
3
4
1000
0
�������
0
3
0
11
74979

 */
import java.util.Scanner;

public class Dominoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 1002;
		int mod = 100003;
		int[] dominoSequences = new int[max];
		dominoSequences[2] = 3;
		dominoSequences[4] = 11;
		for (int i = 6; i < max; i += 2)
			dominoSequences[i] = ((4 * dominoSequences[i - 2]) % mod - dominoSequences[i - 4] + mod) % mod;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			if (n % 2 == 1) {
				System.out.println(0);
				continue;
			}
			System.out.println(dominoSequences[n]);
		}
	}
}
