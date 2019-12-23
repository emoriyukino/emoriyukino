import java.util.Random;

public class kadai3 {
	public static void main(String[] args) {
	    Random sc = new java.util.Random();
	    int[] numbers = new int[6];
	    for(int a = 0; a < 6 ; a++) {
	    	 numbers[a]  = sc.nextInt(9);
	    }
		int max = numbers[0];
		int min = numbers[0];
		for (int a=0; a < numbers.length; a++) {
			if(a >= 1 && a < 5) {
				System.out.print(","+numbers[a]);
			}else if (a == 5) {
				System.out.print(","+numbers[a]+"]");
			}else {
				System.out.print("["+numbers[a]);
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





