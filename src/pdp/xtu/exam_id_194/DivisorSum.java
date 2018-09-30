package pdp.xtu.exam_id_194;

/*��Ŀ����
��һ��������n������n�������ӵ��ۼӺ͡�
����
ÿ��һ������n��1��n��100,000,000�����nΪ0��ʾ�������������Ҫ����
���
ÿ�����һ�������
��������
1 ----> 1
2 ----> 3
3 ----> 4
4 ----> 7
0 ----> exit(0);
*/
import java.util.Scanner;

public class DivisorSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int[][] a = new int[2][32];
			int n = input.nextInt();
			if (n == 0)
				break;
			if (n == 1) {
				System.out.println(1);
				continue;
			}
			int y = 0;
			int j = 0;
			if (n % 2 == 0) {
				int k = 0;
				a[0][j] = 2;
				for (; n % 2 == 0; k++)
					n /= 2;
				a[1][j++] = k;
			}
			for (int i = 3; i * i <= n; i += 2)
				if (n % i == 0) {
					int k;
					a[0][j] = i;
					for (k = 0; n % i == 0; ++k)
						n = n / i;
					a[1][j++] = k;
				}
			if (n != 1) {
				a[0][j] = n;
				a[1][j++] = 1;
			}
			System.out.println(method(a, j - 1));
		}
	}

	public static int pow(int x, int n) {
		int temp = 1;
		for (int i = 0; i < n; i++)
			temp *= x;
		return temp;
	}

	public static int method(int[][] arr, int x) {
		int y = 0, i;
		for (i = 0; i <= arr[1][x]; ++i)
			y += pow(arr[0][x], i);
		if (x == 0)
			return y;
		else
			return y * method(arr, x - 1);
	}
}
