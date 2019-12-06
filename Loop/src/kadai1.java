import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {

		System.out.print("数字を入力してください:");
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();

		int sum = 0;



		for(int a=1;a<=intNum;a++) {

			 
			  sum += a;
			  

		}

		System.out.println("1から"+intNum+"までの合計:"+sum);
		sc.close();


	}

}
