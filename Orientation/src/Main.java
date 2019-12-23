
public class Main {

	public static void main(String[] args) {
		// 課題２で作成
		System.out.println("インスタンスを生成していない状態");
		System.out.println(Person.wallet);
		Person hoge1 = new Person(1000);
		Person hoge2 = new Person(2000);
		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge1.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge2.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);
		//課題２→静的フィールドを使用すると、walletの値は引数の値が違う場合でも同じ参照先
		//になってしまう。

		//課題4で作成
		Animal h = new Animal();
		Dog sh = new Dog();
		//課題５で作成
		System.out.println("名前:" + sh.name);
		System.out.println("年齢:" + sh.age + "歳");
		System.out.println("体重:" + sh.weight + "kg");
		sh.run();
		//課題４で作成
		h.sleep();
		sh.sleep();

	}

}
