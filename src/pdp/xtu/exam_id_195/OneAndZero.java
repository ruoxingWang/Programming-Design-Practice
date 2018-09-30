package pdp.xtu.exam_id_195;
/*
 * ��Ŀ����
һ��01�ַ�����������n������1��0��m�������ʲ�ͬ�����з������ж��ٸ���
����
��һ����һ������K����ʾ�����ĸ����� �Ժ�ÿ����������n��m��1��n��33,0��m��n��
���
ÿ�����һ�������Ľ����
��������
4
2 0
2 1
3 0
3 1
�������
2
0
0
3
����
��һ������Ϊ"01"��"10"���ڶ����������������������Ĵ������ĸ�����Ϊ"011","101","110"
 */
import java.util.Scanner;

public class OneAndZero {
	public static int max = 35;
	public static int[][] arr = new int[max][max];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		initArray();
		for (int simple = 0; simple < N; simple++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n - m) % 2 != 0)
				System.out.println(0);
			else {
				int temp = (n - m) / 2;
				initArray();
				System.out.println(arr[n][temp]);
			}
		}

	}
	public static void initArray() {
		for (int i = 1; i < 35; i++)
			arr[i][0] = arr[i][i] = 1;
		for (int i = 1; i < 35; i++)
			for (int j = 1; j < i; j++)
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
	}
}
