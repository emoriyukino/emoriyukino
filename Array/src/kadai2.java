
public class kadai2 {

	public static void main(String[] args) {
		int[]numbers = {7, 6, 5, 4, 3, 2, 1};
		for(int a = 0 ; a < 7 ; a++) {
			if(a > 0) {
				System.out.print(","+numbers[a]);
			}else {
				System.out.print(numbers[0]);
			}
		}
		System.out.println("");
		
		for(int a = 6 ; a >= 0 ; a--) {
			if(a < 6) {
				System.out.print(","+numbers[a]);
			}else {
				System.out.print(numbers[6]);
			}
		}
	}

}
