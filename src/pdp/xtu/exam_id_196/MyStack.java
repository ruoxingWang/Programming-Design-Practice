package pdp.xtu.exam_id_196;
/*
 * ��Ŀ����
һ��ջ��֧�����ֲ���:
PUSH x ,��xѹ��ջ��
POP,��ջ������
MIN,�����ǰջ����Сֵ,���ջΪ�գ����NULL
����һ�������б���ģ����������̡�
����
��һ����һ������K����ʾ�����ĸ����� ÿ�������ĵ�һ����һ������M����ʾ�����������Ŀ1��M��100,000��
 �Ժ��M�У�ÿ��һ�����ջ������ֵ����[0,1000000000]֮�䡣
���
ÿ��MIN�������һ�������ռһ�С�
��������
2
6 
MIN 
PUSH 2
PUSH 1 
MIN 
POP 
MIN 
6 
PUSH 3 
MIN 
PUSH 1 
MIN 
PUSH 2 
MIN
�������
NULL 
1 
2 
3 
1 
1
��ʾ
�޴���������������ʹ��C�������������
 */
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for(int simple = 0; simple < K; simple++){
			int insCount = sc.nextInt();
			Stack<Integer> list = new Stack<Integer>();
			for(int i = 0; i < insCount; i++){
				String ins = sc.next();
				if(ins.charAt(1) == 'U'){
					int value = sc.nextInt();
					instructions(list,1,value);
				}
				if(ins.charAt(1) == 'O'){
					instructions(list,0,0);
				}
				if(ins.charAt(0) == 'M'){
					if(list.size() == 0)
						System.out.println("NULL");
					else
						System.out.println(min(list));
				}
			}
		}
	}
	public static void instructions(Stack<Integer> list,int c,int va){
		switch (c) {
		case 1:
			list.push(va);
			break;
		case 0:
			list.pop();
		}
	}
	
	public static int min(Stack<Integer> list){
		int min = list.peek();
		for (Integer e : list) {
			if(e < min)
				min = e;
		}
		return min;
	}
}
