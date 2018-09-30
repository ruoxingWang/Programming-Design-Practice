package pdp.xtu.exam_id_196;


/*
 * ��Ŀ����
��N���ߣ����������ߣ�ʹ�����һ�������Σ���ʹ����������ε��ܳ����
����
���ڶ�������� ��һ����һ������N(3��N;��10,000),���N=0,���ʾ��������� 
�ڶ�����N����������������[1,100000000]֮�䣬ΪN���ߵĳ��ȡ�
���
�������ܳ������ε��ܳ�,���������������Σ����0��
��������
5
5 3 4 10 2
0
�������
12

 */
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n == 0)
				break;
			int[] num = new int[n];
			for(int i = 0; i < n; i++){
				num[i] = cin.nextInt();
			}
			Arrays.sort(num);
			boolean isTriangle = false;
			for(int i = n - 1; i > 2; i--){
				if(num[i] < (num[i-1] + num[i-2])){
					System.out.println(num[i] + num[i-1] + num[i-2]);
					isTriangle = true;
					break;
				}
			}
			if(!isTriangle)
				System.out.println(0);
		}
	}
}
