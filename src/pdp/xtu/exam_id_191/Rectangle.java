package pdp.xtu.exam_id_191;

/*��Ŀ����
��������ƽ����������ľ��Σ����ж������ǲ����ཻ��������غϵĲ��֣���
����
��һ����һ������K����ʾ�������� ÿ������ռ���У�ÿ����4����������ʾһ�����εĶԽ��ߵ�����꣬����ֵΪ0��1,000֮�䡣
���
ÿ���������һ��������ཻ���Yes���������No��
��������
2
0 0 1 1
1 1 2 2
0 0 2 2
1 1 3 3
�������
No
Yes*/

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		for (int simple = 0; simple < K; simple++) {
			int a[] = new int[4];
			int b[] = new int[4];
			for (int i = 0; i < 4; i++)
				a[i] = input.nextInt();
			int ax = Math.abs(a[2] - a[0]);
			int ay = Math.abs(a[3] - a[1]);
			for (int i = 0; i < 4; i++)
				b[i] = input.nextInt();
			int bx = Math.abs(b[2] - b[0]);
			int by = Math.abs(b[3] - b[1]);
			
			if ((ax + bx) > method(a, b, 0)) {
				if ((ay + by) > method(a, b, 1))
					System.out.println("Yes");
				else
					System.out.println("No");
			} else
				System.out.println("No");
		}
	}

	public static int method(int[] a, int[] b, int i) {
		int temp1 = (a[i] < a[i + 2]) ? a[i] : a[i + 2];
		int temp2 = (b[i] > b[i + 2]) ? b[i] : b[i + 2];
		return Math.abs(temp1 - temp2);
	}
	
}
