package pdp.xtu.exam_id_194;
/*
 * �û�
��Ŀ����
��һ���û�����С��n�������û�P=(12233441),
P(x1,x2,x3,x4)  = (x4,x1,x2,x3)
P2(x1,x2,x3,x4) = (x3,x4,x1,x2)
P3(x1,x2,x3,x4) = (x2,x3,x4,x1)
P4(x1,x2,x3,x4) = (x1,x2,x3,x4)
����n=4��
����
��һ����һ������K(1��K��1000)����ʾ�����ĸ�����
���
���һ�������Ľ����
��������
3
3 1 2 3
3 2 1 3
3 2 3 1
�������
1
2
3
 */
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for (int simple = 0; simple < K; simple++) {
			int n = sc.nextInt();
			int[] matrix = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				matrix[i] = sc.nextInt();
			}
			int result = 1;
			for (int i = 1; i <= n; i++) {
				int pos = i;
				int tmp = 0;
				do {
					pos = matrix[pos];
					tmp++;
				} while (pos != i);
				result = result / GCD(result, tmp) * tmp;
			}
			System.out.println(result);
		}
	}
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a % b);
	}
}
