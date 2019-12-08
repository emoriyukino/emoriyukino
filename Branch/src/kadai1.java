import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {

		System.out.println("10以上の数字を入力してください");

		//int intNum = new java.util.Scanner(System.in).nextInt();
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();
		if(intNum < 10) {
		   intNum *= 10;
		}
		System.out.println("値:"+intNum);
		sc.close();
		}
	}


