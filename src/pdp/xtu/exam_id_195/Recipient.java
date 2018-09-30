package pdp.xtu.exam_id_195;

/*
 * ��Ŀ����
���С��ÿ�춼������Ϳ�ݣ���������Ҫ��N�ݿ�ݸ�N���ռ��ˣ���i�ݿ����Ҫ�͸���i���ռ��ˡ�
�������з���ǡ��K���ʹ��˵�������Ƕ��٣�
����
���ڶ������� ÿ��������������N��K��1��N��1000,0��K��N�� 
���������Ϊ0�����ʾ��������������������Ҫ����
���
ÿ�����һ�������Ľ������Ϊ��ֵ��Ƚϴ����н����Ҫ��109+7ȡģ��
��������
1 1
2 1
3 2
1000 1000
0 0
�������
0
0
3
37043040
 */
import java.util.Scanner;

public class Recipient {
	public static int max = 1001;
	public static int mod = 1000000007;
	public static long[] exp = new long[max];
	public static long[][] combSequences = new long[max][max];
	public static void main(String[] args) {
		initSequences();
		Scanner cin = new Scanner(System.in);
		while (true) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			if(m == 0){
				System.out.println(1);
				continue;
			}
			System.out.println(exp[m] * combSequences[n][m] % mod);
			
		}
	}
	public static void initSequences(){
		exp[2] = 1;
	    for(int i = 3; i < max; i ++)
	        exp[i] = (i - 1) * (exp[i-1] + exp[i-2]) % mod;
	    for(int i = 1; i < max; i ++)
	        combSequences[i][0] = combSequences[i][i] = 1;
	    for(int i = 2; i < max; i ++)
	        for(int j = 1; j < i; j ++)
	            combSequences[i][j] = (combSequences[i-1][j-1] + combSequences[i-1][j]) % mod;
	}
}
