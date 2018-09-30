package pdp.xtu.exam_id_192;

/*��Ŀ����
��������ָ����a2+b2=c2���������������������ġ������������塱��
���ڸ�������������,�����Ƿ��������һ����������ʹ���Ϊ������������
����
��һ����һ������K����ʾ�����ĸ����� �Ժ�ÿ��һ��������Ϊ��������x,y,(1��x,y��10000)��
���
ÿ�����һ�������Ľ����������ܹ��ɹ������������None����������ڶ���������С���Ǹ���
��������
3 3 4 2 6 12 13
�������
5 None 5*/

import java.util.Scanner;

public class Pythagorean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			if (a == b) {
				System.out.println("None");
				continue;
			}
			int y = a * a + b * b;
			int x = Math.abs(a * a - b * b);
			isPythagorean(y,x);
		}
	}

	public static void isPythagorean(int x, int y) {
		double tempA = Math.sqrt(x);
		double tempB = Math.sqrt(y);
		if (tempA == (int)tempA) {
			System.out.println((int) tempA);
		} else if (tempB == (int)tempB) {
			System.out.println((int) tempB);
		} else {
			System.out.println("None");
		}
	}
}
