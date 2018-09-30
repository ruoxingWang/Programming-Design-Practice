package pdp.xtu.exam_id_194;
/*
 ����
��һ����һ������K(K��1,000),��ʾ�����ĸ����� �Ժ�ÿ��һ������M(1��M��1,000,000)
���
ÿ�����һ�������Ľ�������������������N�����0��
��������
5
1
2
3
4
999989
�������
1
0
3
0
473670

 */

import java.util.Scanner;

public class RepeatOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int simple = 0; simple < N; simple++) {
			int m = sc.nextInt();
			if (m % 2 == 0 || m % 5 == 0) {
				System.out.println(0);
				continue;
			}
			int sum = 1;
			int n = 1;
			while(sum % m != 0){
				sum = sum * 10 + 1;
				sum %= m;
				n++;
			}
			System.out.println(n);
		}
	}

}
