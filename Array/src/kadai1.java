public class kadai1 {

	public static void main(String[] args) {
		int[] scores = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
		int sum = 0 ;
		for(int a = 0 ; a < 11; a++) {
			 if(a >= 1 && a <= 10) {
			   System.out.print(","+scores[a]);
			 }else if (a == 10) {
			   System.out.print(","+scores[a]+"]");
			 }else {
			   System.out.print("配列:["+scores[a]);
			 }
		 }
		System.out.print("}");
		System.out.println("");
		for(int number : scores) {
			sum += number;
		}
		System.out.print("合計:"+sum);
	}


}
