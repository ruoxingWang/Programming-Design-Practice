package pdp.xtu.exam_id_195;

/*
 * ��Ŀ����
����n������m����ɫ��Ҫ�����ڸ����β�����ɫ��ͬ�������ж����ֲ�ͬ����Ϳ������
����
ÿ�������������n��m��1��n,m��1,000��
���
ÿ�����һ�������Ľ�������ڿ��ܻ�ܴ��������1000003ȡģ��
��������
1 1
1 2
3 2
1000 10
�������
1
2
0
566585

 */
import java.util.Scanner;

public class Color {
	public static void main(String[] args) throws Exception {
		//StreamTokenizer sc = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		Scanner sc = new Scanner(System.in);
		int mod = 1000003;
		//while (sc.nextToken() != StreamTokenizer.TT_EOF) 
		while (sc.hasNext()){
			//int n = (int)sc.nval;
			//int m = (int)sc.nval;
			int n = sc.nextInt();
			int m = sc.nextInt();
			long[] colorSequences = new long[3000];
			colorSequences[1] = m;
			colorSequences[2] = m * (m - 1) % mod;
			colorSequences[3] = m * (m - 1) * (m - 2) % mod;
			if (n > 3)
				for (int i = 4; i <= n; i++) {
					colorSequences[i] = (colorSequences[i - 1] * (m - 2) % mod + colorSequences[i - 2] * (m - 1) % mod) % mod;
				}
			System.out.println(colorSequences[n] % mod);
		}
	}
}
