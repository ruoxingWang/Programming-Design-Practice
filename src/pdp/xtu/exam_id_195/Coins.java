package pdp.xtu.exam_id_195;
/*
 * ��Ŀ����
һ������Ӳ����n�Σ��󲻴�������2��Ϊ����ķ�������
����
ÿ��һ��������n��n��40�����nΪ0����ʾ�������������Ҫ����
���
ÿ�����һ�������Ϊһ��������
��������
1
2
3
0
�������
2
3
5
 */
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] FibonacciSequence = new int[42];
		FibonacciSequence[1] = 2;
		FibonacciSequence[2] = 3;
		for (int i = 3; i <= 40; i++) {
			FibonacciSequence[i] = FibonacciSequence[i - 1] + FibonacciSequence[i - 2];
		}
		while (true) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			System.out.println(FibonacciSequence[n]);

		}
	}
}
