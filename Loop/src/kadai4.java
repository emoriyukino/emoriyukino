import java.util.Scanner;

public class kadai4 {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();
		System.out.print("正の約数を入力してください:");
		for(int a = 1; a <= intNum;a++) {
			if(a == 1) {
				System.out.print(a);
			}
			if(intNum % a == 0 && a > 1) {
				System.out.print(","+a);
			}
		}
		sc.close();
	}
}
