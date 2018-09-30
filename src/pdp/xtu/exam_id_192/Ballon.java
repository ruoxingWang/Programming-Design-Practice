package pdp.xtu.exam_id_192;
/*
 * ��Ŀ����
 * ICPC�����������һ�����Ժ󣬻ᷢһ����ʶ�������ɫ������ �ָ���2���ӹ����������ɫ�������Ƕ����˵���������Щ��
 * ����
 * ��һ����һ������K����ʾ�����ĸ�����K��100���� ÿ�������ĵ�һ������������N��M��1��N,M��100000��
 * ��ʾ�����ӷֱ����������� �ڶ������зֱ���N��M�����������Xi��Yi��0��Xi,Yi��109����ʾ�������ɫ�� 
 * �������ݱ�֤����{Xi}��{Yi}��Ԫ�ض���Ψһ��,����������һ�����ڽ�����
 * ���
 * ÿ������������У���һ�������ͬ�Ĺ�����ĿS���ڶ��а��������S��������ÿ������֮���һ���ո�
 * ��������:
 * 		2
 * 		3 3
 * 		1 2 3
 * 		1 2 3
 * 		3 2
 * 		1 2 3
 * 		2 3
 * �������:
 * 		3
 * 		1 2 3
 * 		2
 * 		2 3
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ballon {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int K = cin.nextInt();
		for (int k = 0; k < K; k++) {
			int A = cin.nextInt();
			int B = cin.nextInt();
			HashSet<Integer> hs = new HashSet<Integer>();
			int[] array = new int[100000];
			int index = 0;
			for (int i = 0; i < A; i++) {
				int temp = cin.nextInt();
				hs.add(temp);
			}
			for (int i = 0; i < B; i++) {
				int temp = cin.nextInt();
				if (!hs.add(temp)) {
					array[index] = temp;
					index++;
				}
			}
			System.out.println(index);
			Arrays.sort(array, 0, index);
			for (int i = 0; i < index - 1; i++) {
				if(array[i] == 0) break;
				System.out.print(array[i] + " ");
			}
			if (index > 0)
				System.out.println(array[index - 1]);
		}
	}
}
