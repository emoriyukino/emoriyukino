import java.util.Random;

public class kadai3 {
	public static void main(String[] args) {
	    Random sc = new java.util.Random();
		int A  = sc.nextInt(9);
		int B  = sc.nextInt(9);
		int C  = sc.nextInt(9);
		int D  = sc.nextInt(9);
		int E  = sc.nextInt(9);
		int F  = sc.nextInt(9);
		int[] numbers = {A, B, C, D, E, F};
		int max = numbers[0];
		int min = numbers[0];
		for (int a=0; a < numbers.length; a++) {
			if(a >= 1 && a < 5) {
				System.out.print(","+numbers[a]);
			}else if (a == 5) {
				System.out.print(","+numbers[5]+"]");
			}else {
				System.out.print("["+numbers[0]);
			}
			if (max < numbers[a]) {
				max = numbers[a];
			}
			if (min > numbers[a]) {
				min = numbers[a];
			}
		}
		System.out.println("");
		System.out.println("最大値は: " + max);
		System.out.println("最小値は: " + min);
	}
}





