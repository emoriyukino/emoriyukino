package midtermExam2;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int[] numbers = new int[10];
		int sum = 0;
		for(int a = 0; a < numbers.length ; a++ ) {
			 numbers[a] = sc.nextInt();
			 sum += numbers[a];
		}
		int avg = sum / numbers.length;
		System.out.println("平均値は" + avg);
		sc.close();
		
	}
	

}
