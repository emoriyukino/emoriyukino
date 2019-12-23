//課題４で作成
public class Dog extends Animal {

	
	double weight;
	
	public Dog() {
		//superの引数、this.weightの値は課題５で追加
		super("ポチ",5);
		this.weight = 12.3;	
	}
	public void run() {
		System.out.println(name + "は走った");
	}
	public void sleep() {
		System.out.println(name + "は眠った");
	}
}
