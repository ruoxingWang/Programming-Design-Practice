package pdp.xtu.exam_id_191;

/*ֻ�������֣�Ӣ����ĸ���»������
����ĸ����������
�����ǹؼ��֣��ؼ���һ��32��Ϊ:
auto break case char const continue default do double else enum extern
float for goto if int long register return short signed sizeof static
struct switch typedef union unsigned void volatile while
���ڸ�һ���ַ��������ж�һ���Ƿ�Ϊ�Ϸ��ı�ʶ����
����
��һ����һ������K��K�� 10000������ʾ�����ĸ����� �Ժ�ÿ����һ�������հ׷����ַ��������Ȳ�����32���ַ���
���
ÿ�����һ�������Ľ��������ǺϷ��ı�ʶ���������Yes�������������No���������Ų�Ҫ�����
��������
5
1a
a
a1
_
if
*/
import java.util.Scanner;

public class LegalIdentifier {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String regex = "^[A-Za-z_][A-Za-z0-9_]{0,}$";
		String[] keyWord = new String[] { 
				"auto","break","case","char","const","continue","default","do",
				"double","else","enum","extern","float","for","goto","if",
				"int","long","register","return","short","signed","sizeof","static",
				"struct","switch","typedef","union","unsigned","void","volatile","while"
				};
		int len = keyWord.length;
		for (int i = 0; i < k; i++) {
			String name = input.next();
			if (!name.matches(regex)) {
				System.out.println("No");
				continue;
			}
			int index = 0;
			boolean isLegal = true;
			for (; index < len; index++) {
				if (name.equals(keyWord[index])) {
					System.out.println("No");
					isLegal = false;
					break;
				}
			}
			if (isLegal)
				System.out.println("Yes");
		}

	}
}
