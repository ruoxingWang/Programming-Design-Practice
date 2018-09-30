package pdp.xtu.exam_id_191;
/*
 * ��Ŀ����
Alice��Bob������һ��Ͷ��������֪������һ��Ͷ����N��������֮��ıȷֲ���M���ͱ����Ľ�������ʱ����ıȷ��Ƕ��٣�
����
���������ÿ������ռһ�У�Ϊ�Ǹ�����N��M��(0��N,M�� 200),��������� 
�����AliceӮ���������ΪAlice�������BobӮ�Ļ����������ΪBob��ƽ��ΪDraw��
���
���ÿ�α����ıȷ֣�ǰ��ΪAlice������ΪBob���м���:��������������������ıȷ֣����Impossible��
��������
4 2 Alice
4 2 Bob
4 0 Draw
2 3 Alice
1 1 Draw
1 1 Alice
1 1 Bob
0 0 Draw
0 0 Alice
0 0 Bob
2 0 Draw
2 0 Alice
2 0 Bob
4 2 Draw
4 2 Alice
4 2 Bob
�������
3:1
1:3
2:2
Impossible
 */
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int add = cin.nextInt();
			int sub = cin.nextInt();
			String win = cin.next();
			if (add < sub || (add + sub) % 2 == 1) {
				System.out.println("Impossible");
				continue;
			}
			int alice = (add + sub) / 2;
			int bob = add - alice;
			if (win.equals("Draw")) {
				if (sub == 0)
					System.out.println(alice + ":" + bob);
				else
					System.out.println("Impossible");
			} else if (win.equals("Alice")) {
				if (alice > bob)
					System.out.println((alice + ":" + bob));
				else
					System.out.println("Impossible");
			} else if (win.equals("Bob")) {
				if (alice > bob)
					System.out.println((bob + ":" + alice));
				else
					System.out.println("Impossible");
			}

		}
	}
}