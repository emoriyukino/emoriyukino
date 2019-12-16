import java.util.ArrayList;
import java.util.HashMap;
public class kadai4 {

	public static void main(String[] args) {
		int[]numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer>numberG = new ArrayList<>();
		ArrayList<Integer>numberK = new ArrayList<>();
		for(int a = 0 ; a < numbers.length; a++) {
			if(numbers[a] % 2 == 0) {
				numberG.add(numbers[a]);
			}else {
				numberK.add(numbers[a]);
			}
		}
		HashMap<String,ArrayList<Integer>>map = new HashMap<>();
		map.put("偶数: ",numberG);
		map.put("奇数: ",numberK);
		System.out.println(map);
	}
}
