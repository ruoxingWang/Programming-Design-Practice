package pdp.xtu.exam_id_191;

/*��Ŀ����
�󷽳� (x+a)/(x+b) = c�ķǸ�������������a,b,c���ǷǸ�������
��һ����һ������K����ʾ�����ĸ�����K��30000�����Ժ��K��ÿ��Ϊ��һ�����������������Ǹ�����a,b,c (a,b,c �� 109)��
ÿ�����һ�������Ľ�����������û�и��������None���������������ֵ��������ڶ�����������С���Ǹ���
6
1 1 1
1 1 2
3 1 2
0 0 0
1 0 0
0 1 0
Sample Output
0
None
1
 */
import java.util.Scanner;

public class SolveRoot {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int k = cin.nextInt();
		for (int i = 0; i < k; i++) {
			long a = cin.nextLong();
			long b = cin.nextLong();
			long c = cin.nextLong();
			long tempA = a- b * c;
			long tempB = c - 1;
			if (c == 1) {
				if (a == b) {
					if (a == 0)
						System.out.println(1);
					else
						System.out.println(0);
				} else
					System.out.println("None");
				continue;
			} else {
				if (tempA == 0 && b != 0)
					System.out.println(0);
				else if (tempA / tempB < 0)
					System.out.println("None");
				else if (tempA % tempB == 0) {
					if (tempA / tempB == (-b))
						System.out.println("None");
					else
						System.out.println(tempA / tempB);
				} else
					System.out.println("None");
			}
		}
	}
}
