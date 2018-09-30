package pdp.xtu.exam_id_195;
/*
 ��Ŀ����
��nλ01������������2��1�Ĵ��ĸ�����
 ����
��һ����һ������K��K��10000������ʾ�����ĸ����� ÿ��������һ������n(1��1000000)��
���
ÿ�����һ�������Ľ������Ϊ��Ŀ���ܴܺ����109+7ȡģ��
��������
5
1
2
3
4
1000000
�������
0
1
3
8
782550144
 */
import java.util.Scanner;

public class BinaryString {
	public static int mod = 1000000007;
	public static int max = 1000001;
	public static int[] numberArray = new int[max];
	public static int[] arr = new int[max];
	public static void main(String[] args) {
		initSequences();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int simple = 0; simple < N; simple++) {
			int n = sc.nextInt();
			System.out.println(numberArray[n]);
		}
	}
	public static void initSequences() {
		arr[2] = 1;
		for (int i = 3; i < max; i++)
			arr[i] = arr[i - 1] * 2 % mod;
		numberArray[2] = 1;
		numberArray[3] = 3;
		for (int i = 4; i < max; i++)
			numberArray[i] = ((numberArray[i - 1] + numberArray[i - 2]) % mod + arr[i]) % mod;
	}
}
