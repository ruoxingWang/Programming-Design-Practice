package pdp.xtu.exam_id_196;

/*����
�����ĵ�һ����һ������T����ʾ�����ĸ�����
 ÿ�������ĵ�һ������������N��2��N��1,000���� M��1��M��100,000��, 
 �ֱ��ʾ�������ͱ����������Ŵ�1��N���Ժ��M��Ϊ�ߣ�ÿ������������ ��ʾ�������˵����š�
���
ÿ�����һ�������Ľ�����������һ�ʻ��������Yes���������No��
��������
2
2 1
1 2
4 3
1 2
1 3
1 4
�������
Yes
No
��ʾ
�޴�����룬��ʹ��C��������
*/
import java.util.Scanner;

public class EulerGraph {
	public static int max = 1002;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		for (int simple = 0; simple < K; simple++) {
			int n = input.nextInt();
			int m = input.nextInt();
			int[] eulerGraph = new int[max];
			for (int i = 0; i < m; i++) {
				int row = input.nextInt();
				int col = input.nextInt();
				eulerGraph[row]++;
				eulerGraph[col]++;
			}
			int temp = 0;
			for (int i = 1; i <= n; i++) {
				if (eulerGraph[i] % 2 == 1)
					temp++;
			}
			if (temp == 2 || temp == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
