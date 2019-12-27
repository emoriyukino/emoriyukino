//課題４で作成
public class Dog extends Animal {
	double weight;
	public Dog() {
		//superの引数とthis.weightの値は課題５で追加
		super("ポチ",5);
		this.weight = 12.3;
	}
	public void run() {
		System.out.println(this.name + "は走った");
	}
	public void sleep() {
		System.out.println(this.name + "は眠った");
	}
}
