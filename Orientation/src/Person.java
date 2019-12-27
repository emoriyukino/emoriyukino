
public class Person {
	//静的フィールドは課題2で作成
	  static int wallet = 200;
	//下記フィールドは課題1で作成
	//アクセス修飾子privateと ="" と= 0は課題３で追加
	  private String name = "";
	  private int age = 0;

	//課題１で作成したコンストラクタ
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	//課題2で作成したコンストラクタ
	public Person(int wallet) {
		 Person.wallet += wallet  ;
	}
	//課題３で作成したコンストラクタ
	public String getName() {
		return this.name ;
	}
	public int getAge() {
		return this.age ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//課題１で作成したmyProfile()method
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age 	+ "です。");
		System.out.println("よろしくお願いします。");
	}

}
