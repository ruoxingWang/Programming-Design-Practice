package pdp.xtu.exam_id_191;

/*��Ŀ����
Ericϣ���������һ�°༶��ƽ���ɼ�������Ϊ�˷�ֹ����߷ֺ͵ͷ�ѧ������ƽ���ɼ���Ӱ�죬
��Ҫȥ��һ����߷ֺ�һ����ͷֵ�ͬѧ��Ȼ����ƽ���֡�
����
ÿ�������ĵ�һ����һ������N(10��N��50)����ʾ�༶���������NΪ0����ʾ��������������������Ҫ���� 
�ڶ�����N��������ÿ����������[0,100]�ڡ�
���
ÿ�����һ�������Ľ����Ϊһ��������������һλС����
��������
10
10 20 30 40 50 60 70 80 90 100
0
�������
55.0*/

import java.util.Arrays;
import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			double sum = 0;
			int N = input.nextInt();
			if (N == 0)
				break;
			double[] score = new double[N];
			for (int i = 0; i < N; i++) {
				score[i] = input.nextDouble();
			}
			Arrays.sort(score);
			for (int i = 1; i < N - 1; i++) {
				sum += score[i];
			}
			System.out.printf("%.1f\n",sum / (N - 2));
		}
	}

}
