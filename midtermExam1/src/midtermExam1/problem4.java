package midtermExam1;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		System.out.println("月を表す数値を入れてください");
		Scanner sc = new java.util.Scanner(System.in);
		int Month = sc.nextInt();
		switch(Month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31日");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30日");
				break;
			case 2:
				System.out.println("28日");
				break;
			default:
				System.out.println("入力値は１～１２の数字にしてください。");
		}
		
		
		sc.close();

	}

}
