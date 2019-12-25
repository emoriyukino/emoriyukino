import java.util.Scanner;

public class kadai4 {
	public static void main(String[] args) {
		System.out.print("正の約数を入力してください:");
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();
		System.out.print(intNum+"の約数: ");
		for(int a = 1; a <= intNum ;a++) {
			if(a > 1 || a <= intNum) {
				System.out.print(","+a);
			}else {
				System.out.print(a);
			}
		}
		sc.close();
	}
}
