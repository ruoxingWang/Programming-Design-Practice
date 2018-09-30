package pdp.xtu.exam_id_194;

/*
 * ��Ŀ����
�����a��b�������͡�
����
��һ����һ������K����ʾ�����ĸ����� �Ժ�ÿ��һ������������Ϊ�������� a,b, 1��a��b��1,000,000,000��
���
ÿ�����һ�������Ľ�������ڿ��ܻ�ܴ���Ҫ�������10003ȡģ��
��������
	2
	1 2
	1 3
�������
	9
	36
 */
//1~n��������Ϊn^2*(n+1)^2/4������1~b�������ͼ�ȥ1~(a-1)�������;���[a,b]��������
import java.util.Scanner;

public class CubeSum {
	private static int mod = 10003;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int simple = cin.nextInt();
		for (int k = 0; k < simple; k++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int A = cube(a - 1);
			int B = cube(b);
			System.out.println(B > A ? B - A : B - A + mod);
		}
	}

	public static int cube(int x) {
		int temp;
		if (x % 2 == 0) {
			temp = ((((x + 1) / 2) % mod) * (x % mod)) % mod;
		} else {
			temp = ((x / 2) % mod * ((x + 1) % mod)) % mod;
		}
		return (temp * temp) % mod;
	}
}