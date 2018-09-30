package pdp.xtu.exam_id_194;



/*
 * ��Ŀ����
���鳤��ΪL�ף�������ǰ��������������٣��ȴӶ�β�ܵ���ͷ���ٴӶ�ͷ�ܻض�β���ڼ�����н���S�ס����ʴ����һ�����˶����ף�
����
�ж��������ÿ��������������L(1 �� L �� 10,000),S(1��S��10,000)�����L��S��Ϊ0���ʾ��������������������Ҫ����
���
ÿ�����һ�������Ľ��������2λС����
��������
300 400
100 100
0 0
�������
800.00
241.42
 */
import java.util.Scanner;

public class Soldier {

	public static void main(String[] args) {

		double result = 0;
		Scanner input = new Scanner(System.in);
		double x, y;
		while (true) {
			x = input.nextLong();
			y = input.nextLong();
			if (x == 0 && y == 0)
				break;
			if (y != 0)
				result = Math.sqrt(x * x + y * y) + x;
			System.out.printf("%.2f\n", result);
		}
	}
}
