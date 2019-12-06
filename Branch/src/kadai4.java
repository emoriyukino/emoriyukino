import java.util.Scanner;

public class kadai4 {

	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		System.out.println("numA:"+ numA);
		System.out.println("numB:"+numB);
		if ( 0 >= numA || 0 >= numB) {
			System.out.println("正の整数を入力してください。");
		}else if((numA % numB) == 0){
			System.out.println("numBはnumAの約数です。");
		}else  {
			System.out.println("numBはnumAの約数ではありません。");
		}
		sc.close();
	}

}
