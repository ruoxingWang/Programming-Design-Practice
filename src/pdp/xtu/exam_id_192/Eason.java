package pdp.xtu.exam_id_192;

/*
 * ��Ŀ����
	Eason�Ǹ��ǳ����ŵ��ˣ���ϲ������3��6����ϲ��4��7��
	���һ�����ֵ�������û��4��7������3����6�Ļ������ͻ�ϲ��������֡� 
	���磬����ϲ��13,36�����ǲ���ϲ��14,34��
	������28���ֵģ���������νϲ�����ǲ�ϲ���� 
	Eason��֪������[a,b]��һ���ж��ٸ���ϲ���Ͳ�ϲ�������֣�
����
ÿ������һ��������Ϊa��b,0��a��b��106�����a��b��Ϊ0����ô��������������������Ҫ����
���
ÿ�����һ�������Ľ���������ϲ�����ֵĸ������������ϲ�����ֵĸ�����
��������
1 10 
1 100 
1 1000000 
0 0
�������
2 2 
28 36 
215488 737856
 */
import java.util.Scanner;

public class Eason {
	//private static String regexLove = "[10235689]+";
	private static String regexLove = "[^47]+";//���������ʽ�������������regexLove
	//private static String regex = "[102589]+";
	private static String regex = "[^3467]+";//���������ʽ�������������regex
	private static int[] loveNumber = new int[1000005];
	private static int[] hateNumber = new int[1000005];
	public static void main(String[] args) {
		for(int i = 1;i < 1000005;i++){
	        loveNumber[i] = loveNumber[i-1] + love(i);
	        hateNumber[i] = hateNumber[i-1] +hate(i);
	    }
		Scanner cin = new Scanner(System.in);
		while (true) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (a == 0 && b == 0)
				break;
			System.out.println((loveNumber[b]-loveNumber[a-1])+" "+(hateNumber[b]-hateNumber[a-1]));
		}
	}
	public static int none(int num) {
		return String.valueOf(num).matches(regex) ? 1 : 0;
	}
	
	public static int love(int num) {
		return (String.valueOf(num).matches(regexLove) && !String.valueOf(num).matches(regex))? 1 : 0;
	}

	public static int hate(int num) {
		return !String.valueOf(num).matches(regexLove) ? 1 : 0;
	}
}
