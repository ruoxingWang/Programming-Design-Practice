package pdp.xtu.exam_id_195;

import java.util.Scanner;

public class Demo195 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long sum = 0;
		for(int i = 0; i <= n; i++){
			sum += recurrence(i);
		}
		System.out.println(sum);
		//System.out.println(recurrence(n));
	}
	
	public static long recurrence(int x){
		if(x == 0) return 0;
		if(x == 1) return 1;
		else
			return recurrence(x - 1) + recurrence(x-2);
	}

}
