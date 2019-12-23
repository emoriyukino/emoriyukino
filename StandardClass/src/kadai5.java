
public class kadai5 {

	public static void main(String[] args) {
		String text1 = "cat_mouse_mouse_cat_cat";
		String parts1 = "cat";
		String parts2 = "mouse";
		int a = ( text1.length() - text1.replaceAll(parts1,"").length()) / parts1.length();
		int b = (text1.length() - text1.replaceAll(parts2,"").length()) / parts2.length();
		if(a > b) {
			System.out.println("catの方が多い");
		}else {
			System.out.println("mouseの方が多い");
		}
	}
}
