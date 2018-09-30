package pdp.xtu.exam_id_194;

//-----------------n�Ľ׳��ж���λ ---------------------------------
import java.util.Scanner;

public class FactorN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int samples = input.nextInt();
		for (int s = 0; s < samples; s++) {
			int n = input.nextInt();
			//int m = input.nextInt();
			double d = 0;
			for (int i = 1; i <= n; i++) {
				d += Math.log10(i);
			}
			int digit = (int)(d+1);
			System.out.println(digit);
		}
	}
}
