package pdp.xtu.exam_id_191;

/*��Ŀ����
С��ϲ����a+b���������������������ǰ�ĩλ���룬�ٽ��мӣ����ԣ���������� ����12+13������12������1λ����������133�� 
С���Ѿ�����һЩ��ʽ�������һ���������ƶ��˶���λ��
����
��һ����һ������K����ʾ�����ĸ����� �Ժ�ÿ��һ������������a+b=c, 1��a,b��1e4;0��c��1e9��
���
ÿ�����һ�������Ľ������bΪ��׼��a���������nλ�����n�����������nλ�����-n�� 
�������ݱ�֤һ���н⣬������ڶ���⣬������ƵĽ����
��������
6
12+13=1213
12+13=1312
12+13=25
12+13=12013
12+13=133
12+13=142
�������
2
-2
0
3
1
-1*/

import java.util.Scanner;

public class AaddB_5 {

	public static void main(String[] args) {
		AaddB_5 obj = new AaddB_5();
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			String addexpression = input.next();
			String[] add = addexpression.split("\\+|=");
			int a = Integer.parseInt(add[0]);
			int b = Integer.parseInt(add[1]);
			int c = Integer.parseInt(add[2]);
			int result = 0;
			for (int j = -9; j < 9; j++) {
				if (j <= 0) {
					int newB = obj.move(b, (-j));
					if (newB + a == c) {
						result = j;
						break;

					}
				} else {
					int newA = obj.move(a, j);
					if (newA + b == c) {
						result = j;
						break;
					}
				}
			}
			System.out.println(result);
		}
	}

	public int move(int num, int x) {
		return num * (int) Math.pow(10, x);
	}

}
