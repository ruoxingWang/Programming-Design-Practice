package pdp.xtu.exam_id_191;

/*��Ŀ����
����a,b,����a+b = c,a*b = d,��֪c��d�����Ƿ����a��b��
����
��һ����һ������K����ʾ���������� ÿ������ռ1�У���������c��d��0��c,d��109��
���
ÿ�����һ�������Ľ����a��b(a��b)��֮����һ���ո������
������ڶ��飬���a��С����һ��; ���������������a��b�������None�������Ų����������
��������
2
5 6
7 11
�������
2 3
None
*/
//---> x^2 - cx + d = 0 �Ľ�
import java.util.Scanner;

public class SumTimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			long c = input.nextLong();
			long d = input.nextLong();
			if (!hasRoot(c, d)) {
				System.out.println("None");
				continue;
			}else{
				long x= (long)c*c - 4*d;
				long temp = (long)Math.sqrt(x);
				long x1 = (c - temp) / 2;
				long x2 = (c + temp) / 2;
				System.out.println(x1+" "+ x2);
			}
		}
	}
	
	public static boolean hasRoot(long c, long d) {
		long x= (long)c*c - 4*d;
		if(x < 0)
			return false;
		double temp = Math.sqrt(x);
		long a = (long)temp;
		if(a*a == x)
			return true;
		return false;
	}
}
