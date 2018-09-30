package pdp.xtu.exam_id_193;
/*
Description
���ʱ�׼��ţ�International Standard Book Number�������ISBN��
����10λ��ɣ�ǰ9λ�������룬���һλ��У���롣 ������{x_1,x_2,x_3,��x_10}��ʾһ��ISBN�룬
����0��{x_1,��x_9}��9, 0 �� X_10 �� 10�� ��X_10��10ʱ��ʹ���ַ���X����ʾ��
�������������
10*x_1 + 9*x_2 + 8*x_3 + 7*x_4 + 6*x_5 + 5*x_6 + 4*x_7 + 3*x_8 + 2*x_9 + 1*x_10 = 0 mod 11
����ĳ��ISBN����ֵ��Ϳ���ˣ������������λ������������ֵ��ʲô��
����
ÿ��һ���ַ�����һ��10λ����ʾһ��ISBN�룬��Ϳ�ڵ���?��ʾ������ֻ��һ�������뱣֤һ���н⡣
���
�����Ӧ��ISBN�롣
��������
123456789?
1?1111111X
�������
123456789X
101111111X
 */
import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int sum = 0;
			char[] isbnArray = cin.next().toCharArray();
			for (int index = 0; index < 10; index++) {
				if (isbnArray[index] == '?')
					continue;
				int tmp = -1;
				if (isbnArray[index] == 'X')
					tmp = 10;
				else
					tmp = isbnArray[index] - '0';
				sum += (10 - index) * tmp;
				sum %= 11;
			}
			for (int i = 0; i < 10; i++) {
				if (isbnArray[i] == '?') {
					for (int j = 0; j <= 10; j++) {
						if ((sum + (10 - i) * j) % 11 == 0) {
							if (j == 10)
								isbnArray[i] = 'X';
							else
								isbnArray[i] = (char) (j + '0');
							break;
						}
					}
				}
			}
			System.out.println(new String(isbnArray));
		}
	}
}
