package pdp.xtu.exam_id_194;

/*��Ŀ����
 * WCBĳ�����˷ǳ�����ǹ��������Ƿֳ�N�ݣ����ηֱ���1��2��3��,N���ǹ���
 * �����ó����е�3�ݷָ��������ѣ� Ϊ�˲���������������������������ݵ��ǹ�����ǡ���ܱ����˾��֡�
 * ������һ���ж����ֲ�ͬ����Ϸ��������ж����������ݣ�ÿ������Ǹ�����N(3��N��106),
 * ���N=0����ʾ��������������������Ҫ����
 * ÿ���������һ��������ռһ�У���ʾ���ж����ַ�����
 * ���ڿ��ܻ�ܴ��������109+7ȡģ��
 * 3 --> 1
 * 4 --> 2
 * 5 --> 4
 * 0 --> ����
*/
import java.util.Scanner;

public class Candy {
	public static void main(String[] args) {
		int M = 1000000007;
		Scanner input = new Scanner(System.in);
		while (true) {
			long n = input.nextLong();
			if (n == 0)
				break;
			long sum1, sum2, sum3;
			sum1 = sum2 = sum3 = n / 3;
			n -= (n / 3 * 3);
			if (n == 1)
				sum1++;
			if (n == 2) {
				sum1++;
				sum2++;
			}
			if (n == 0);
			long a = sum1;
			long b = sum2;
			long c = sum3;
			long comb = a * b * c % M;
			comb = (comb + (c - 2) * c * (c - 1) / 6 % M) % M;
			comb = (comb + (a - 2) * a * (a - 1) / 6 % M) % M;
			comb = (comb + (b - 2) * b * (b - 1) / 6 % M) % M;
			System.out.println(comb);

		}
	}
}
