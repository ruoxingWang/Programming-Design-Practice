package pdp.xtu.exam_id_193;

/*
 * ��Ŀ����
Bob���¹���һ�׿�ֻ��������ְ�׿�ֻ�����ʹ�õ��ǻ��߷�ʽ��
һ����9���㣬���ǰ�����˳������Ϊ1~9������Ҫ���ڵ�͵�֮�����߲����л�δ�������ĵ㡣
����˵����1���������Ե�2��4��5��6��7��8�����ǲ��ܵ���3��7��9��
���������2�������ȵ�1����ʱ��Ϊ2�Ѿ������ˣ����Դ�ʱ���Ե���3��
���ڸ���һ�����룬�������Ƿ������������Ҫ��
����
��һ����һ������T(1��T��10000)����ʾ�����ĸ�����
һ������ռһ�У���һ�����Ϊ4λ���9λ��ֻ��1-9���ַ�������1-9���ֻ��1����
���
ÿ���������һ�У�����Ϸ������Yes�������������No����
��������
3
16852
213
132
�������
Yes
Yes
No
 */
import java.util.Scanner;

public class PasswordOfBob {
	private static int[][] matrix =
		   {{0,1,0,1,1,1,0,1,0},
            {1,0,1,1,1,1,1,0,1},
            {0,1,0,1,1,1,0,1,0},
            {1,1,1,0,1,0,1,1,1},
            {1,1,1,1,0,1,1,1,1},
            {1,1,1,0,1,0,1,1,1},
            {0,1,0,1,1,1,0,1,0},
            {1,0,1,1,1,1,1,0,1},
            {0,1,0,1,1,1,0,1,0}};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int simple = cin.nextInt();
		for (int k = 0; k < simple; k++) {
			String password = cin.next();
			System.out.println(leagalPassword(password));
		}
	}
	public static int e(String str,int index){
		return str.charAt(index);
	}
	public static String leagalPassword(String password) {
		int[] b = new int[100];
		int len = password.length();
		String result = "Yes";
        for(int i = 0;i < len-1;i++){
            if(matrix[e(password,i)-'1'][e(password,i+1)-'1']==1){
                b[e(password,i)-'1'] = 1;
            }else{
                if(b[(e(password,i)+e(password,i+1)-2*'1')/2]==1){
                    b[e(password,i)-'1'] = 1;
                }else{
                    result = "No";
                    break;
                }
            }
        }
        return result;
	}
}
