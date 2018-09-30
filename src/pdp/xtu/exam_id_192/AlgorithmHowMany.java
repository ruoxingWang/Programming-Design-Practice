package pdp.xtu.exam_id_192;

/*��Ŀ����
С�������Ӽ����������⣬��Щ��������������ô���᲻��𰸣���Щ����������ˡ� ����д�������ж�һ��С�������˼����⣿
ÿ��һ������ʽ,����a+b=c,a-b=c,a+b=,a-b=��0��a,b,c��100
1+1=2
1+2=4
2-1=1
2-2=
3+6=
�������
2*/

import java.util.Scanner;

public class AlgorithmHowMany {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String regex = "[\\+|\\-|=]";
		int sum = 0;
		while(cin.hasNext()){
			String exp = cin.nextLine();
			String[] str = exp.split(regex);
			int[] a = new int[3];
			if(str.length == 2)
				continue;
			for(int i = 0;i < 3;i++){
				a[i] = Integer.valueOf(str[i]);
			}
			if((exp.indexOf('+') >= 0) && a[0]+a[1]==a[2])
				sum++;
			if((exp.indexOf('-') >= 0) && a[0]-a[1]==a[2])
				sum++;
		}
		System.out.println(sum);
	}
}