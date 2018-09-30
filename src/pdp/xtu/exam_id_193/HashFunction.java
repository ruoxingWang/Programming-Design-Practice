package pdp.xtu.exam_id_193;

/*
 * ��Ŀ����
ƽ��ȡ���ǳ��õ�һ������Hash��������������x������x*x,Ȼ��ȡ���봮���м�4λ��Ϊhashֵ��
�㷨���£�
1. s = x*x
2. ���sλ��Ϊ����������֮ǰ��0
3. ���s���벻��4λ�ģ�ȡs������ȡs������м�4λ��ɵ�10����������Ϊhashֵ�� 
�ָ�x�������hash(x)��
����
ÿ��һ��������x,(x �� 109)��
���
���������Ӧx��hashֵ��
��������
1
10
100
1000
�������
1
100
1000
0
Sample Input
 */
import java.math.BigInteger;
import java.util.Scanner;

public class HashFunction {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int str = sc.nextInt();
			BigInteger bi = new BigInteger(""+str).multiply(new BigInteger(""+str));
			String hash = bi.toString(10);
			if(hash.length() % 2 == 1)
				hash = "0" + bi.toString();
			int len = hash.length();
			if(len <= 4)
				System.out.println(bi);
			else 
				System.out.println(Integer.valueOf(hash.substring(len / 2 - 2,len / 2 + 2)));
		}
	}
}
