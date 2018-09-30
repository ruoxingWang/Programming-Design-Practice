package pdp.xtu.exam_id_192;

/*��Ŀ����
����һ������a1,a2,...,an,��m������������ɵ��Ӷκ����ֵ��
����
�ж��������ÿ�������ĵ�һ������������n��m��(1��m��n;��100,000)�����n��mΪ0��ʾ��������������������Ҫ�����ڶ�����n������ai��0��ai��10000��
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
8*/
import java.util.Arrays;
import java.util.Scanner;

public class SequenceSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int sum = 0;
			int len = input.nextInt();
			int n = input.nextInt();
			if (len == 0 && n == 0)
				break;
			int[] sequence = new int[len];
			for (int i = 0; i < len; i++) {
				sequence[i] = input.nextInt();
				sum += sequence[i];
			}
			if(n >= len / 2) {
				int[] sumSequence = new int[len - n + 1];
				for (int i = 0; i < len - n + 1; i++) {
					for(int j = 0;j < n;j++){
						sumSequence[i] += sequence[i + j];
					}
				}
				Arrays.sort(sumSequence);
				System.out.println(sumSequence[len - n]);
			} else {
				int[] sumSequence = new int[ n + 1];
				for(int i = 0; i < n + 1; i++) {
					for(int j = 0, index = len - 1 - i; j < len -n; j++, index--) {
						sumSequence[i] += sequence[index];
					}
				}
				Arrays.sort(sumSequence);
				System.out.println(sum - sumSequence[0]);
			}
		}
	}
}
