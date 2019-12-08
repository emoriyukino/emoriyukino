import java.util.Scanner;

public class kadai6 {

	public static void main(String[] args) {

		System.out.println("1から５までの数字を入力してください");
		Scanner sc = new java.util.Scanner(System.in);
		int intNum =sc.nextInt();
		String msg;
		switch (intNum) {
			case 1:
				msg = "Ⅰ";
				break;
			case 2:
				msg = "Ⅱ";
				break;
			case 3:
				msg = "Ⅲ";
				break;
			case 4:
				msg = "Ⅳ";
				break;
			case 5:
				msg = "Ⅴ";
				break;
			default:
				msg ="unknown";
				break;
		}
		System.out.println( intNum+" -> "+msg);
		sc.close();

	}

}
