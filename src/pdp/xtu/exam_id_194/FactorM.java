package pdp.xtu.exam_id_194;

/*
 * ����N�Ľ׳�,N���Ե���1000������
 */
import java.util.Scanner;

public class FactorM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int samples = input.nextInt();
		int a[] = new int[3000];
		for (int s = 0; s < samples; s++) {
			int n = input.nextInt();
			//int m = input.nextInt();
			a[0] = 1;
			if (n == 0) {
				System.out.println(1);
				continue;
			}
			int length = 1;
			for (int i = 1; i <= n; i++) {
				int flag = 0;
				int j = 0;
				int t;
				for (j = 0; j < length; j++) {
					t = i * a[j];
					a[j] = (t + flag) % 10;
					flag = (t + flag) / 10;
				}
				while (flag != 0) {
					a[j] = flag % 10;
					j++;
					length++;
					flag = flag / 10;
				}
			}
			//a[]������n����˵Ľ׳˵�λ��
			for (int index = length - 1; index > 0; index--) {
				System.out.print(a[index]);
			}
			System.out.println();
		}
	}
}
