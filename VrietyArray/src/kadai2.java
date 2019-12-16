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
		System.out.println("奇数: "+numberK);
		System.out.println("偶数: "+numberG);

	}

}