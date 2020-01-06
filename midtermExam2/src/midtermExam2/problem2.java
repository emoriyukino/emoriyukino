package midtermExam2;
import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		System.out.println("整数0か1を10回入力してください");
		Scanner sc = new java.util.Scanner(System.in);
		int [] numbers = new int[10];
		int count = 0;
		int count2 = 0;
		for(int a = 0 ; a < numbers.length ; a++) {
			numbers[a] = sc.nextInt();
			if(numbers[a] == 1) {
				count++;
			}
			if(numbers[a] == 0) {
				count2++;
			}
		}
		System.out.println("1は" + count + "個");
		System.out.println("0は" + count2 + "個");
		if(count > count2) {
			System.out.println("よって1の勝ち");
		}
		if(count < count2) {
			System.out.println("よって0の勝ち");
		}
		if(count == count2) {
			System.out.println("よって引分けです");
		}
		sc.close();

	}

}
