package pdp.xtu.exam_id_193;


/*
 * ��Ŀ����
Alice��Bob����������Ϸ��������������������ӣ���Ϸ�������£�
	1)���������ȼ���1����������6,5,4,3,2��
	2)�������ӵ�����ͬ����Ϊ"����"������֮�䰴�������ȼ��Ƚϴ�С��
	3)���ֻ���������ӵ�����ͬ����Ϊ"����"������֮�䰴�������ȼ��Ƚϴ�С��
	4)���������Ϊ"����"�����Ӱ������ͱȽϴ�С��
	5)���ӱȶ��ӡ����Ӵ󣬶��ӱȵ��Ӵ�������ӵĵ������ȼ���ͬ���Ϳ�ʣ���Ǹ����ӵĵ������ȼ���
���ڸ���Alice��BobͶ�����ӵ�������ж�һ��ʤ�������
����
��һ������һ������K����ʾ��Ϸ�Ĵ����� �Ժ�ÿ���б�ʾһ����������һ����Alice���ӵĵ������ڶ�����Bob���ӵĵ�����
���
�����AliceӮ�����"Alice",�����BobӮ�����"Bob",�������"Draw"��
��������
3
1 1 1
6 6 6
2 1 2
4 5 4
4 5 6
6 5 4
�������
Alice
Bob
Draw
 */
import java.util.Arrays;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int simple = cin.nextInt();
		for (int k = 0; k < simple; k++) {
			int[] alice = new int[3];
			int[] bob = new int[3];
			for (int index = 0; index < 3; index++) {
				alice[index] = cin.nextInt();
			}
			for (int index = 0; index < 3; index++) {
				bob[index] = cin.nextInt();
			}
			int[] Alice = new int[3];
			int[] Bob = new int[3];
			for (int index = 0; index < 3; index++) {
				Alice[index] = alice[index];
				Alice[index] = To1(Alice[index]);
				Bob[index] = bob[index];
				Bob[index] = To1(Bob[index]);
			}
			Arrays.sort(Alice);
			Arrays.sort(alice);
			Arrays.sort(bob);
			Arrays.sort(Bob);
			if(leopard(Alice)){
				print(greaterLeopard(Alice, Bob));
			}
			
			if(pair(Alice)){
				print(greaterPair(Alice, Bob));
			}
			if(spot(Alice)){
				if(spot(Bob))
						print(spotSpot(alice, bob));
				else
					System.out.println("Bob");
			}
		}
	}

	public static int To1(int x) {
		if (x == 1)
			x = 7;
		return x;
	}

	public static boolean leopard(int[] arr) {
		return (arr[0] == arr[1] && arr[1] == arr[2]) ? true : false;
	}

	public static boolean pair(int[] arr) {
		if(arr[0] == arr[1] && arr[1] != arr[2])
			return true;
		if(arr[0] != arr[1] && arr[1] == arr[2])
			return true;
		return false;
	}

	public static boolean spot(int[] arr) {
		return (arr[1]!=arr[0] && arr[1]!=arr[2]) ? true : false;
	}
	
	
	public static int greaterLeopard(int[] a, int[] b) {
		if (leopard(b)) {
			if (b[0] > a[0])
				return 2;
			if (b[0] == a[0])
				return 0;
		} 
		return 1;
	}
	public static int greaterPair(int[] a, int[] b) {
		int aspot = 0;
		int bspot = 0;
		if (a[1] == a[0]) {
			aspot = a[2];
		}
		if (a[1] == a[2]) {
			aspot = a[0];
		}
		
		if (leopard(b))
			return 2;
		
		if(pair(b)){
			if (b[1] == b[0]) {
				bspot = b[2];
			}
			if (b[1] == b[2]) {
				bspot = b[0];
			}
			
			if (b[1] == a[1]) {
				if (bspot == aspot)
					return 0;
				if (bspot > aspot)
					return 2;
				return 1;
			}
			if(b[1] > a[1]){
				return 2;
			}
		}
		return 1;
	}
	public static int greaterSpot(int[] a, int[] b) {
		return 2;
	}
	
	public static int spotSpot(int[] a, int[] b){
		int sumA = 0;
		int sumB = 0;
		for (int index = 0; index < 3; index++) {
			sumA += a[index];
			sumB += b[index];
		}
		if(sumA == sumB)
			return 0;
		if(sumA > sumB)
			return 1;
		return 2;
	}
	
	public static void print(int result){
		if (result == 0)
			System.out.println("Draw");
		if (result == 1)
			System.out.println("Alice");
		if (result == 2)
			System.out.println("Bob");
	}
	public static String isDice(int[] a){
		if(leopard(a))
			return "Leopard";
		if(pair(a))
			return "Pair";
		if(spot(a))
			return "Spot";
		return "Impossible";
	}
}
