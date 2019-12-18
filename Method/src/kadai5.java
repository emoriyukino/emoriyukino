import java.util.Scanner;

//import com.sun.tools.javac.util.StringUtils;


public class kadai5 {
	public static void main(String[] args)throws Exception {
		Scanner sc = new java.util.Scanner(System.in);
		String[]Arrays = new String [4];
		for(int b = 0; b < 4 ; b++) {
			String msg = sc.nextLine();
	        Arrays[b] = msg;
				
		}
		boolean Result = nullCheak(Arrays);
		if(Result == true) {
			System.out.println("---配列にnullがある場合----");
			System.out.println(Result);
		}else {
			System.out.println("---配列にnullがない場合----");
			System.out.println(Result);
		}
		sc.close();
	}

	public static boolean nullCheak (String[]arrays) {
		boolean Result=false;
		for(int a = 0 ; a < arrays.length; a++) {
			if(arrays[a]== null) {
			 Result = true;
			 break;
			}
		}
		return Result;
	}
}







