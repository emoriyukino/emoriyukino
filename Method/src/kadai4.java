
public class kadai4 {
	public static void main(String[] args) {
		System.out.println("---①文字列の場合----");
		System.out.println(overload("文字列１","文字列2"));
		System.out.println("---②整数のみの場合----");
		System.out.println(overload(3, 5));
		System.out.println("---③少数の場合----");
		System.out.println(overload(3.5, 5.5));
	}
	public static String overload(String a, String b) {
		return a + b;
	}
	public static int overload(int c, int d) {
		return c + d;
	}
	public static double overload(double e, double f) {
		return e + f;
	}


}
