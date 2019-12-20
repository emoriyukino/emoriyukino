import java.util.Scanner;
public class kadai4 {

	public static void main(String[] args) {
		System.out.print("探したい文字: ");
		Scanner sc = new java.util.Scanner(System.in);
		String text1 = sc.nextLine();
		String text2 = "ABCDGOPRSYZ";
		if(text2.contains(text1)) {
			System.out.println(text2+"は"+text1+"を含む");
		}else {
			System.out.println(text2+"は"+text1+"を含まない");
		}	
		sc.close();
	}

}
