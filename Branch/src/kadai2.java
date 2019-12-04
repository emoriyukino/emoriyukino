import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		System.out.println("10以上の数字を入力してください");

		//int intNum = new java.util.Scanner(System.in).nextInt();
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();

		System.out.print("値:");
		if(intNum>=10) {
				System.out.println(intNum);
		}else{
			System.out.println("0"+intNum);
		}
		
		sc.close();

	}
	
}


