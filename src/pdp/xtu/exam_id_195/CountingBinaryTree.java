package pdp.xtu.exam_id_195;
/*
 * ��Ŀ����
���ڶ������Ƿ���ͬ�����Ƕ������£�
������������ͬ��
�����ͷǿ����ǲ�ͬ����
��������ǿն�������������������ͬ����ô��������������ͬ������ͬ
��֪�������Ľڵ����n�����ж��ٸ���ͬ�Ķ�������
����
ÿ������һ������n(0��n��100)�����nΪ-1����ʾ��������������������Ҫ����
���
ÿ�����һ����������Ϊ�������ܺܶ࣬���109+7ȡģ��
��������
0
1
2
3
100
-1
�������
1
1
2
5
558488487
 */
import java.util.Scanner;

public class CountingBinaryTree {
	public static int max = 101;
	public static int mod = 1000000007;
	public static long[] treeSequences = new long[max];
	public static void main(String[] args) {
		initSequences();
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == -1)
				break;
			System.out.println(treeSequences[n]);
		}
	}
	public static void initSequences() {
		treeSequences[0] = 1;
		for (int i = 1; i <= 100; i++) {
			treeSequences[i] = 0;
			for (int j = 0; j < i; j++) {
				long n = treeSequences[j] * treeSequences[i - j - 1] % mod;
				treeSequences[i] += n;
			}
			treeSequences[i] %= mod;

		}
	}
}
