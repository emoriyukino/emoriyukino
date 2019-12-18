
import java.util.ArrayList;
public class kadai5 {
	public static void main(String[] args) {


		ArrayList<String>Arrays = new ArrayList<>();
		Arrays.add("吉田");
		Arrays.add("井上");
		Arrays.add("山崎");
		ArrayList<String>Arrays2 = new ArrayList<>();
		Arrays2.add("吉田");
		Arrays2.add("井上");
		Arrays2.add(null);
		boolean Result = nullCheak(Arrays);
		boolean Result2 = nullCheak(Arrays2);

		System.out.println("---配列にnullがある場合----");
		System.out.println(Result);

		System.out.println("---配列にnullがない場合----");
		System.out.println(Result2);

	}

	public static boolean nullCheak (ArrayList<String> arrays) {
		boolean bbb = false;
		for(int a = 0 ; a < arrays.size(); a++) {
			if(arrays.get(a) == null) {
			 bbb = true;
			 break;
			}
		}

		return bbb;
	}
}







