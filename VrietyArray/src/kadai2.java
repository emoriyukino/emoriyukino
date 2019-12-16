import java.util.ArrayList;
public class kadai2 {
	
	public static void main(String[] args) {
		int[]numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer>numberK = new ArrayList<>();
		ArrayList<Integer>numberG = new ArrayList<>();
		for(int a = 0; a < numbers.length ; a++) {
			if(numbers[a] % 2 > 0) {
				numberK.add(numbers[a]);
			}else {
				numberG.add(numbers[a]);
			}
		}
		for(int b = 0; b < numberK.size() ; b++) {
			if(b > 0 && b < numberK.size() - 1) {
				System.out.print(","+numberK.get(b));
			}else if(b ==  numberK.size() - 1){
				System.out.print(","+numberK.get(b)+"]");
			}else {
				System.out.print("奇数: ["+numberK.get(b));
			}
		}
		System.out.println("");
		for(int c = 0; c < numberG.size() ; c++) {
			if(c > 0 && c < numberG.size() - 1) {
				System.out.print(","+numberG.get(c));
			}else if(c ==  numberG.size() - 1){
				System.out.print(","+numberG.get(c)+"]");
			}else {
				System.out.print("偶数: ["+numberG.get(c));
			}
		}

	}

}