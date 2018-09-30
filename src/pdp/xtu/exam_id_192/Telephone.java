package pdp.xtu.exam_id_192;
/*��Ŀ����
�����Ͼ�����Ҫ��ʾ�û����ֻ����룬����һ��Ϊ�˱����û�����˽���Ὣ�м��4λ�����á�*�����档
���ڸ���һ���绰���룬����������ĵ绰���롣
����
��һ����һ������K����ʾ�����ĸ����� �Ժ�ÿ��һ���ֻ����룬һ��11λ��
���
ÿ�����һ�������
��������
2
13112345678
13198765432
�������
131****5678
131****5432*/

import java.util.Scanner;

public class Telephone {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			String tel = input.next();
			String str = tel.substring(0, 3) + "****"+ tel.substring(7, tel.length());
			System.out.println(str);
		}
	}
}
