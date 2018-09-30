package pdp.xtu.exam_id_193;

/*
 * ��Ŀ����
������һ��XOY�����ƽ���ϣ�������һ��ʼλ��ԭ�㣬����Y�������� 
�����˿���ִ������ת������ת�����ת��ǰ���ĸ�ָ� ָ��Ϊ
LEFT:����ת
RIGHT:����ת
BACK:���ת
FORWORD n:��ǰ��n(1��n��100)����λ
���ڸ���һ��ָ�����У�����������յ�λ�á�
����
�����ĵ�һ����һ������T(T��20)����ʾ�����ĸ����� 
ÿ�������ĵ�һ����һ������N(1��N��1,000)����ʾָ��������� �Ժ��N�У�ÿ��һ��ָ�
���
ÿ�������������������Ϊ����(x,y)��֮���ÿո������
��������
2
4
LEFT
FORWORD 1
RIGHT
FORWORD 1
2
BACK
FORWORD 1
�������
-1 1
0 -1
 */
import java.util.Scanner;

public class Robot1 {
	private static int direction;// 0-->Y+ ; 1-->X+ ; 2-->Y- ; 3-->X-
	private static int abscissa;// ������
	private static int ordinate;// ������
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int simple = cin.nextInt();
		for (int k = 0; k < simple; k++) {
			int instructions = cin.nextInt();
			for (int i = 0; i < instructions; i++) {
				String instruction = cin.next();
				switch (instruction.charAt(0)) {
				case 'F':
					int moveN = cin.nextInt();
					forword(moveN);
				default:
					direct(instruction.charAt(0));
				}
			}
			System.out.println(abscissa + " " + ordinate);
			direction = 0;
			abscissa = 0;
			ordinate = 0;
		}
	}

	// �ı䷽��
	public static void direct(char ins) {
		switch (ins) {
		case 'L':
			direction = ((direction - 1) + 4 ) % 4;
			break;
		case 'R':
			direction = (direction + 1) % 4;
			break;
		case 'B':
			direction = (direction + 2) % 4;
		}

	}

	// ǰ��n
	public static void forword(int n) {
		switch (direction) {
		case 0:
			ordinate += n;
			break;
		case 1:
			abscissa += n;
			break;
		case 2:
			ordinate -= n;
			break;
		case 3:
			abscissa -= n;
		}
	}
}
