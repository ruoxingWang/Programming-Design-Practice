package pdp.xtu.exam_id_192;



/*
 * ��Ŀ����
 * Ericϲ�����У�����������ڿ����м���ʱ���ȥ���ˡ�
 * ���ƻ���ȥ3����ͬ�ĳ��У����Ҳ����ظ�ȥ��ͬ�ĳ��У����ص������ĳ��У�
 * ����֪����ô�߿����ò��÷��ý�����ͣ� ���ǰѳ��б��Ϊ0~3��Eric�ܴ�0�ų��г�����
 * ����
 * ��һ����һ������K����ʾ�����ĸ����� ÿ������ռ4�У�ÿ��4������
 * Xij,��i�е�j�и�������ʾ�ӳ���i������j����Ҫ���÷ѣ����η��ò�����1000��i = j ʱ��Xij = 0��
 * ���
 * ÿ�����һ�������Ľ�����������У���һ���ǲ��õ��ܷ��ã��ڶ�����3�����еı�����У�
 * ÿ�����б��֮����һ���ո��������ʾ���е�·�ߣ�������ڶ�����·�������ٻ��ѣ�������ֵ��������Щ��·��ÿ����·һ�С�
 * ��������:
	1
	0 1 1 1
	2 0 2 2
	3 3 0 3
	4 4 4 0
 * �������:
	10
	1 2 3
	1 3 2
	2 1 3
	2 3 1
	3 1 2
	3 2 1
 */
import java.util.Scanner;

public class Tourist1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int K = cin.nextInt();
		for (int k = 0; k < K; k++) {
			int[][] a = new int[4][4];
			int[] fee = new int[6];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			int[] sum = new int[6];
			sum[0] = a[0][1] + a[1][2] + a[2][3] + a[3][0];
			sum[1] = a[0][1] + a[1][3] + a[3][2] + a[2][0];
			sum[2] = a[0][2] + a[2][1] + a[1][3] + a[3][0];
			sum[3] = a[0][2] + a[2][3] + a[3][1] + a[1][0];
			sum[4] = a[0][3] + a[3][1] + a[1][2] + a[2][0];
			sum[5] = a[0][3] + a[3][2] + a[2][1] + a[1][0];
			int min = sum[0];
			for (int index = 0; index < 6; index++) {
				if (min > sum[index])
					min = sum[index];
			}
			System.out.println(min);
			if (sum[0] == min)
				System.out.println("1 2 3");
			if (sum[1] == min)
				System.out.println("1 3 2");
			if (sum[2] == min)
				System.out.println("2 1 3");
			if (sum[3] == min)
				System.out.println("2 3 1");
			if (sum[4] == min)
				System.out.println("3 1 2");
			if (sum[5] == min)
				System.out.println("3 2 1");
		}
	}
}