package pdp.xtu.exam_id_194;

/*
��Ŀ����
����������n,����������k,ʹ��n����k����k�������ۼӺͣ����ǳ����������Ǹ��ױ�����������������
���� 11�Ͳ���һ�����ױ���������Ϊ10����10�������ۼӺ�1����11;��20����һ�����ױ�������
����
��һ����һ������K(K��10,000)����ʾ�����ĸ�����
�Ժ�ÿ��һ��������n(1��n��1,000,000,000)
���
ÿ�����һ�������Ľ��������Ǹ��ױ��������"Yes",�������"No"��
��������
5
1
2
3
20
21
�������
Yes
No
Yes
Yes
No
 */
import java.util.Scanner;

public class ColombianNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for (int simple = 0; simple < K; simple++) {
			int n = sc.nextInt();
			int temp = n;
			int digit = 0;
			while (temp != 0) {
				digit++;
				temp /= 10;
			}
			boolean isColombianNumber = false;
			for (int i = n - digit * 9; i < n; i++) {//i <= n
				int j = i;
				int sum = 0;
				while (j != 0) {
					sum += j % 10;
					j /= 10;
				}
				if (i + sum == n) {
					isColombianNumber = true;
					break;
				}
			}
			System.out.println(!isColombianNumber ? "Yes" : "No");
		}
	}
}
