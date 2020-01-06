package midtermExam1;
import java.util.Scanner;

public class problem3 {
	public static void main(String[]Args) {
		Scanner sc = new java.util.Scanner(System.in);
		int x  = sc.nextInt();
		int y = sc.nextInt();
		if(x > y) {
			System.out.println("xはyより大きい。");
		}else if(x < y){
			System.out.println("xはｙより小さい。");
		}else {
			System.out.println("xはｙ同じ。");
		}
		sc.close();
	}

}
