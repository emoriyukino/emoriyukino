package midtermExam1;
import java.util.Scanner;
public class program5 {

	public static void main(String[] args) {
		
		Scanner sc = new java.util.Scanner(System.in);
		int midTest = sc.nextInt();
		System.out.println("");
		int endTest = sc.nextInt();
		
		if(midTest  >= 60 && endTest >= 60) {
			System.out.println("合格");
		} else if(midTest + endTest >= 130) {
			System.out.println("合格");
		} else if(midTest + endTest >= 100 && ( midTest >= 90 || endTest >= 90)){
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		sc.close();

	}

}
