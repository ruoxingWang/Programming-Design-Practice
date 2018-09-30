package pdp.xtu.exam_id_195;

/*
 * ��Ŀ����
һ��N*M�����񣬴����½��ظ������ߵ����Ͻǣ�ֻ�����һ��������ߣ������ж����ֲ�ͬ��·�ߣ�
����
���������ÿ�а�����������N��M(1��N,M��33);���N��MΪ0��ʾ���������
���
ÿ���������һ�У�Ϊ·�ߵ���Ŀ��
��������
1 1
1 2
33 33
0 0
�������
2
3
7219428434016265740  -->long
 */
import java.util.Scanner;

public class Grid {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			int min = Math.min(n, m);
			int max = Math.max(n, m) + 1;
			long[][] matrix = new long[max][max];
			int i, j;
			for (i = 0; i < max; i++){
				matrix[i][0] = 1;
				matrix[0][i] = 1;
			}
			for (i = 1; i < max; i++)
				for (j = 1; j < max; j++){
					matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
					matrix[j][i] = matrix[i - 1][j] + matrix[i][j - 1];
					
				}
			System.out.println(matrix[n][m]);
		}
	}
}
