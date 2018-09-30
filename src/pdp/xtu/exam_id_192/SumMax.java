package pdp.xtu.exam_id_192;

/*
 * ��Ŀ����
����һ������a1,a2,...,an,��m������������ɵ��Ӷκ����ֵ��
����
�ж��������ÿ�������ĵ�һ������������n��m��(1��m��n;��100,000)��
���n��mΪ0��ʾ��������������������Ҫ�����ڶ�����n������ai��0��ai��10000��
���
ÿ�����һ���������������Ľ����
��������
6 3
1 2 3 4 5 6
6 3 
1 2 3 3 2 1
0 0
�������
15
8
 */
import java.util.Scanner;

public class SumMax {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] num = new int[n + 1];
			int[] sum = new int[n + 1];
			for (int index = 1; index < n + 1; index++) {
				num[index] = cin.nextInt();
				sum[index] = sum[index - 1] + num[index];
			}
			int max = 0;
			for(int index = 1;index <= n-m+1;index++){
	            max = Math.max(max,sum[index+m-1]-sum[index-1]);
	        }
			System.out.println(max);
		}
	}
}
