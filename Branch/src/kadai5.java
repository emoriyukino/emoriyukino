import java.util.Scanner;

public class kadai5 {

	public static void main(String[] args) {
		
		Scanner sc = new java.util.Scanner(System.in);
		int numA= sc.nextInt();
		int numB= sc.nextInt();
		int numC= sc.nextInt();
		System.out.println("numA:"+numA);
		System.out.println("numB:"+numB);
		System.out.println("numC:"+numC);
		int max = numA;
		if(numA < numB) {
			max =  numB;
		}
		if (numB < numC){
			max  = numC;
		}
		System.out.println("最大値:"+max);
		sc.close();
	}

}
