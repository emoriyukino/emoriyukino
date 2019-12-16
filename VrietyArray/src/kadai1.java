
import java.util.ArrayList;
public class kadai1 {

	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("北海道");
		names.add("東北");
		names.add("関東");
		names.add("中部");
		names.add("近畿");
		names.add("中国");
		names.add("九州");
		for(String Chihou : names) {
			System.out.println(Chihou);
		}
	}

}
