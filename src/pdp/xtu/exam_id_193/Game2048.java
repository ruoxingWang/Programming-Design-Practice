package pdp.xtu.exam_id_193;
/*
 ��Ŀ����
2048�Ǵ�ҷǳ�ϲ����һ��С��Ϸ������һ��2048�ľ��棬����һ����ָ��������仯��ľ��档 2048����Ϸ�������£�
��Ϸ��һ��4��4�ĸ���
��ҿ���ʹ���ϡ��¡����ҿ������ַ��񻬶���
ÿ����һ�Σ����е����ַ��鶼���������ķ���£����ͬ���ֵķ����ڿ�£����ײʱ����ӡ�
���ϵĵ�������ƴ�ճ�2048������־���ɹ�
ÿ�λ����󣬻���ĳ���հ׸����г��������2����4����������ڿհ׸��ӣ�����Ϸ������
����
��һ����һ������K����ʾ�����ĸ����� ÿ��������ǰ4�У�ÿ��4���������������Ϊ0��ʾ�հ׸��ӣ�����Ϊ���֡� 
ÿ�������ĵ�5�У���ָ�ָ��Ϊ"LEFT","DOWN","RIGHT","UP",���α�ʾ�����ķ���
���
���ÿ�������Ľ��,ÿ�����������һ�����С�
��������
3
2 2 0 0
2 0 2 0
2 0 0 2
0 0 2 2
LEFT
2 0 2 0
2 2 2 2
0 2 0 2
4 2 2 0
LEFT
2 4 2 2
0 2 2 0
0 4 4 4
0 0 0 2
LEFT
�������
4 0 0 0
4 0 0 0
4 0 0 0
4 0 0 0

4 0 0 0
4 4 0 0
4 0 0 0
4 4 0 0

2 4 4 0
4 0 0 0
8 4 0 0
2 0 0 0
 */
import java.util.Scanner;

public class Game2048 {
	private static int maxn = 4;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		for (int simple = 0; simple < N; simple++) {
			int[][] a = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			String sequence = cin.next();
			char[] str = sequence.toCharArray();
			if (str[0] == 'D') {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3 - i; j++) {
						int temp = a[i][j];
						a[i][j] = a[3 - j][3 - i];
						a[3 - j][3 - i] = temp;
					}
				}

				translate(a);
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3 - i; j++) {
						int temp = a[i][j];
						a[i][j] = a[3 - j][3 - i];
						a[3 - j][3 - i] = temp;
					}
				}
			} else if (str[0] == 'L')
				translate(a);
			else if (str[0] == 'U') {
				for (int i = 0; i < 4; i++) {
					for (int j = 3; j > i; j--) {
						int temp = a[i][j];
						a[i][j] = a[j][i];
						a[j][i] = temp;
					}
				}
				translate(a);
				for (int i = 0; i < 4; i++) {
					for (int j = 3; j > i; j--) {
						int temp = a[i][j];
						a[i][j] = a[j][i];
						a[j][i] = temp;
					}
				}

			} else if (str[0] == 'R') {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 2; j++) {
						int temp = a[i][j];
						a[i][j] = a[i][3 - j];
						a[i][3 - j] = temp;
					}
				}
				translate(a);
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 2; j++) {
						int temp = a[i][j];
						a[i][j] = a[i][3 - j];
						a[i][3 - j] = temp;
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println(a[i][j]);
				}
				System.out.println(a[i][3]);
			}
			System.out.println();
		}
	}

	public static void translate(int[][] a) {
		for (int i = 0; i < maxn; i++) {
			for (int j = 0; j < maxn; j++) {
				if (j + 1 < maxn && a[i][j] == a[i][j + 1]) {
					a[i][j] *= 2;
					a[i][j + 1] = 0;
					j++;
				}
				if (j + 2 < maxn && a[i][j] == a[i][j + 2] && a[i][j + 1] == 0) {
					a[i][j] *= 2;
					a[i][j + 2] = 0;
					j += 2;
				}
				if (j + 3 < maxn && a[i][j] == a[i][j + 3] && a[i][j + 1] == 0 && a[i][j + 2] == 0) {
					a[i][j] *= 2;
					a[i][j + 3] = 0;
					j += 3;
				}
			}
		}
		for (int i = 0; i < maxn; i++) {
			int[] s = new int[maxn];
			int cnt = 0;
			for (int j = 0; j < maxn; j++)
				if (a[i][j] == 1)
					s[cnt++] = a[i][j];
			for (int j = 0; j < maxn; j++)
				a[i][j] = s[j];
		}
	}
}
