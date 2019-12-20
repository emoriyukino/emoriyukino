
public class kadai3 {

	public static void main(String[] args) {
	String text1 = "ABCDEFG";
	System.out.println("文字列: "+text1);
	char[]array = text1.toCharArray();
	for(int a = 0, b = array.length - 1; a < b ; a++ , b--) {
		char temp = array[a];
		array[a] = array[b] ;
		array[b] = temp ;
	}
	System.out.println(new String(array)+": 列字文");

	}

}
