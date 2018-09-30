package pdp.xtu.exam_id_195;

/*
 * ��Ŀ����
����һ���ַ���������ڶ��ٸ�������Ϊ"LOVE"? ��ν���������м�����(xi,xj,xk,xt), ���贮����n���ַ�����ô1��i<j<k<t��n��
����
��һ����һ������K��K��1000������ʾ�����ĸ����� �Ժ�ÿ��һ���ַ������ַ���ֻ��Ӣ�Ĵ�д��ĸ�����Ȳ�����1000���ַ���
���
ÿ���������һ�У���Ϊ���ֵ���ܷǳ��󣬽������1000000007ȡģ��
��������
4
LOVE
LOVA
LLOOVVEE
LOVELOVE
�������
1
0
16
5
 */
import java.util.Scanner;

public class Lover {
	public static int max = 1001;
	public static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for (int simple = 0; simple < K; simple++) {
			String loveString = sc.next();
			int len = loveString.length();
			int[][] subSequences = new int[max][4];
			if (loveString.charAt(0) == 'L')
				subSequences[0][0] = 1;
			for (int i = 1; i < len; i++) {
				subSequences[i][0] = subSequences[i - 1][0];
				subSequences[i][1] = subSequences[i - 1][1];
				subSequences[i][2] = subSequences[i - 1][2];
				subSequences[i][3] = subSequences[i - 1][3];
				if (loveString.charAt(i) == 'L') {
					subSequences[i][0] = (subSequences[i - 1][0] + 1) % mod;
				}
				if (loveString.charAt(i) == 'O') {
					subSequences[i][1] = (subSequences[i - 1][1] + subSequences[i - 1][0]) % mod;
				}
				if (loveString.charAt(i) == 'V') {
					subSequences[i][2] = (subSequences[i - 1][2] + subSequences[i - 1][1]) % mod;
				}
				if (loveString.charAt(i) == 'E') {
					subSequences[i][3] = (subSequences[i - 1][3] + subSequences[i - 1][2]) % mod;
				}
			}
			System.out.println(subSequences[len - 1][3]);
		}
	}

}