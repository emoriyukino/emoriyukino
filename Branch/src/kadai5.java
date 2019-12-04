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
		
		
		int numD  = Math.max(numA,numB);
		int numE  = Math.max(numC,numD);
		
		System.out.println("最大値:"+numE);
		
		
		sc.close();
		
	    
	}

}
