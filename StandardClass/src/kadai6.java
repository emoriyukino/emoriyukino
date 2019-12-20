import java.text.SimpleDateFormat;
import java.util.Date;
public class kadai6 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat skd = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat skd2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		System.out.println(skd.format(now));
		System.out.println(skd2.format(now));
	}
}
