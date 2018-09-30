package pdp.xtu.exam_id_191;

/*
 * ��Ŀ����:
 * 	С��һ������a+bʱ��ͻȻ����֪��a+b�ܱ���Щ�������ˣ�����˵2+4=6��������6������1,2,3,6��һ��4���� 
 * 	���������һ�£�a+b�ĺ��ܱ�������������
 * ����:
 * 	��һ����һ������K����ʾ�����ĸ����� ÿ������ռһ�У�Ϊ��������a��b��(1��a,b��1e9)��
 * ���:
 * 	ÿ�����һ�������Ľ����Ϊһ��������
 * ��������:
 * 	2
 * 	2 3
 * 	4 2
 * �������:
 * 	2
 * 	4
 */
import java.util.Scanner;

public class AddMod {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int simple = cin.nextInt();
		for (int k = 0; k < simple; k++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int add = a + b;
			int sqrt = (int) Math.sqrt(add);
			int sum = 0;
			for (int i = 2; i <= sqrt; i++) {
				if (add % i == 0) {
					sum += 2;
				}
			}
			System.out.println((sqrt * sqrt == add)?(sum + 1):(sum + 2));
		}
	}
}
