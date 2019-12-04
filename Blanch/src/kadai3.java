import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();

		if(intNum>0) {
			System.out.println("入力された数字は正の数です。");
		}else if(intNum<0){
			System.out.println("入力された数字は負の数です。");
		}else {
			System.out.println("入力された数字は0です。");
		}
		
		sc.close();


	}

}
