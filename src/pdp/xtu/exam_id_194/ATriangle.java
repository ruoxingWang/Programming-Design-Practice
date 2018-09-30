package pdp.xtu.exam_id_194;
/*Description

��Ŀ����

���ǰ���Ȼ�������µ�����������

 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15
...
ѯ�ʵ�x�еĵ�y����ʲô����
����

��һ�����������K(K��20000)����ʾ���������� ÿ������վһ�У�Ϊ��������x,y(1��y��x��109)

���

ÿ�����һ�������Ľ�*/
import java.util.Scanner;

public class ATriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			long x = input.nextLong();
			long y = input.nextLong();
			System.out.println(f(x - 1) + y);
		}
	}
	private static long f(long x) {
		return x * (1 + x) / 2;
			
	}
}
