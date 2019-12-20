import java.text.SimpleDateFormat;
import java.util.Calendar;
public class kadai7 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat skd = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat skd2 = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("現在日時: "+skd.format(cal.getTime()));

		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("１週間後: "+skd.format(cal.getTime()));

		cal2.set(Calendar.YEAR,2020);
		System.out.println("１年後 : "+skd2.format(cal2.getTime()));


	}

}
