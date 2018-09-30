package pdp.xtu.exam_id_194;

/*
 * ��Ŀ����
 * Alice����Ū��Կ�ף�������������Ҫȥ��Կ�ף������������ܱ�֤ÿһ�����Կ�׶��ܴ򿪡�
 * Alice ������ܣ�����������һ������������Կ������߳ɹ��ʡ�
 * ����ÿ����Կ�׶��Ƕ����¼���������p100�ĸ������Կ�ף�
 * ����AliceҪ�ﵽr100�ĸ���������һ��Կ���ܴ��ţ�������Ҫ����ٰ�Կ�ף�
 * ����
 * ��һ����һ������T(0��T��11,000)����ʾ�������� ÿ������ռһ�У�Ϊ��������p,r��0��p,r��100��
 * ���
 * ÿ�����һ�������Ľ������������ܴﵽĿ�ģ������Impossible��(��Ҫ�������)���������һ��������
 * ��������
 * 50 90
 * �������
 * 4
 */
import java.util.Scanner;

public class Alice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int samples = input.nextInt();
		for (int n = 0; n < samples; n++) {
			int p = input.nextInt();
			int r = input.nextInt();
			p = 100 - p;
			int t = p;
			r = 100 - r;
			boolean no = true;
			for (int i = 1; i < 1000; i++) {
				if (t <= r) {
					System.out.println(i);
					no = false;
					break;
				}
				t = t * p;
				r = r * 100;
			}
			if(no)
				System.out.println("Impossible");
		}
	}
}
