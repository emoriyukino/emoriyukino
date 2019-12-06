import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください:");
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();
		int keta = 0;
		while(intNum>0) {
			intNum /= 10 ;
			keta++;
			
		}
		System.out.print("桁数："+keta);
		sc.close();

	}

}
