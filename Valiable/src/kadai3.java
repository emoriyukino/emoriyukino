
public class kadai3 {

	public static void main(String[] args) {
		

	   System.out.println("変換前");

	   int intNum = 219;
       System.out.println(intNum);

       double doubleNum = 364.2;
       System.out.println(doubleNum);

       long longNum = 123456l;
       System.out.println(longNum);

       System.out.println("変換後");

       long longNumchange = (long)intNum;
       System.out.println(longNumchange);

       float floatNum = (float)doubleNum;
       System.out.println(floatNum);

       double doubleNumchange = (long)longNum;
       System.out.println(doubleNumchange);






	}

}
