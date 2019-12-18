
public class kadai3 {

	public static void main(String[] args) {
		System.out.println("三角形の面積");
		double areaResult = triarea(11.5, 23.5);
		System.out.println(areaResult);
		
	}
	public static double triarea(double bottom, double height) {
		double area = height * bottom / 2;
		double areaResult = Math.round(area);
		return areaResult;
	}

}

