import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください:");
		Scanner sc = new java.util.Scanner(System.in);
		int intNum = sc.nextInt();
		int sum = 0;
		for(int a = 1; a <= intNum; a++) {
			sum += a;
			/*１から計算式を出力→a >= 2以降は数字の前に“＋”が入ると考えられる→
			 * a == 1とそれ以外で区別が必要のため、以下if文を使用。
			 */
			if(a == 1) {
				 System.out.print(a);
			}else {
				 System.out.print(" + "+a);
			}
		}
		System.out.print(" = "+sum);
		sc.close();
	}

}
