
public  class Animal {
	//名前
	String name;
	//年齢
	int age;
	//コンストラクタ
	public Animal() {};
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sleep() {
		System.out.println("眠った");
	}

}
