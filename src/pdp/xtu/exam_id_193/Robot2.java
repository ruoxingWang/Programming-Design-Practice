package pdp.xtu.exam_id_193;
/*
 * ��Ŀ����
��N��������ҪRobotȥ��ɣ����N������ĵص���һ�������ϣ�����Ϊ1��n��
ÿ��������Ҫ�����ai��������ܿ�ʼȥ����
Robot������ֱ���������ƶ�����ʼλ��λ������1�ĵص㣬����������������
����Robot����ת�����ٴη������������е�����
����
���ڶ��������
ÿ�������ĵ�һ����һ������n(1��n��1000),
�ڶ�����һ��n������
�������ݱ�֤һ�����������
���
ÿ�����һ�������Ľ��
��������
3
0 2 0
7
0 3 1 0 5 2 6
�������
1
2
 */
import java.util.Scanner;

public class Robot2 {
	private static final int MAXN = 1000;
	private static int[] a = new int[MAXN];

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int len = cin.nextInt();
			for (int i = 0; i < len; i++)
				a[i] = cin.nextInt();
			int turn = 0;
			int complete = 0;
			while (complete < len) {
				if (turn % 2 == 1) {
					for (int i = len - 1; i >= 0; i--) {
						if (complete >= a[i]) {
							complete++;
							a[i] = 0x3f3f3f3f;

						}
					}
				} else {
					for (int i = 0; i < len; i++) {
						if (complete >= a[i]) {
							a[i] = 0x3f3f3f3f;
							complete++;
						}
					}
				}
				turn++;
			}
			System.out.println(turn - 1);
		}
	}
}
