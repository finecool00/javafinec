package quiz05;

public class Computer extends Calculator {

	Computer() {}
	
	double circle(int a) {
		double result = Math.PI * a * a;
		System.out.println("원의 넓이 : " + result);
		return result;
	}
	
	double rect(double d) {
		
		double result = d * d;
		System.out.println("정사각형의 넓이 : " + result);
		
		return result;
	}
	
	double rect(double d, double dd) {
		
		double result = d * dd;
		System.out.println("직사각형의 넓이 : " + result);
		
		return result;
	}
	
	double rect(double d, double dd, double dx) {
		
		double result = d * dd * dx;
		System.out.println("직육면체의 넓이 : " + result);
		
		return result;
	}
	
}
