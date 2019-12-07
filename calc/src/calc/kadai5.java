package calc;

import java.util.Scanner;

public class kadai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strcha= sc.nextLine();
		String kitei1 = "ノートPCの値段:";
		String kitei2 = "89800";
		String kitei3 = "円";
		System.out.println(kitei1+ kitei2 +kitei3);
		System.out.println(str);
		System.out.println(strcha);
		System.out.println(str+strcha);
		sc.close();
	}
}
