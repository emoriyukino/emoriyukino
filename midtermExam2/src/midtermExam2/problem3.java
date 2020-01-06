package midtermExam2;
import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		System.out.println("xかyのどちらか大きい方の数値を戻してください");
		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("x:");
		int x = sc.nextInt();
		System.out.print("y:");
		int y = sc.nextInt();
		int Result = num(x , y);
		System.out.println(Result);
		sc.close();
	}
	public static int num(int x , int y) {
		int Answer = y;
		if(x > y) {
			 Answer = x;
		}
		return Answer;

	}

}
