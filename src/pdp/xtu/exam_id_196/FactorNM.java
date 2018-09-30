package pdp.xtu.exam_id_196;

/*
 * N�Ľ׳˵ĵ�M��λ��,1 <= N <= 1000;
 */
import java.util.Scanner;

public class FactorNM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int samples = input.nextInt();
		int factor[] = new int[3000];
		int n,m,i,s,j,t,length,flag;
		for (s = 0; s < samples; s++) {
			n = input.nextInt();
			m = input.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append(1);
			factor[0] = 1;
			if (n == 0) {
				System.out.println(1);
				continue;
			}
			length = 1;
			for (i = 1; i <= n; i++) {
				flag = 0;
				for (j = 0; j < length; j++) {
					t = i * factor[j];
					factor[j] = (t + flag) % 10;
					flag = (t + flag) / 10;
				}
				while (flag != 0) {
					factor[j] = flag % 10;
					j++;
					length++;
					flag = flag / 10;
				}
			}
			System.out.println(factor[m - 1]);
		}
	}
}
