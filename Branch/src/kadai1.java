import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {

		System.out.println("10以上の数字を入力してください");

		//int intNum = new java.util.Scanner(System.in).nextInt();
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();


		System.out.print("値:");
		if(intNum>=10) {
				System.out.println(intNum);
		}
		if(intNum<10) {
			System.out.println(intNum*10);
		}
		sc.close();
		
		}
		
						

	}


