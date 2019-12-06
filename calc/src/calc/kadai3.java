package calc;

import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print("合計:");
        System.out.println(a + b + c);
        System.out.print("平均(3で割った時):");
        System.out.println(( a + b + c ) / 3);
        System.out.print("平均(3.0で割った時):");
        System.out.println((a + b + c ) / 3.0);
        sc.close();
	}

}
