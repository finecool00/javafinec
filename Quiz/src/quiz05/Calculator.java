package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;
	
	void add(int a) {
		result += a;
		System.out.println("현재 : " + result);
	}
	
	void sub(int a) {
		result -= a;
		System.out.println("현재 : " + result);
	}
	
	double circle(int a) {
		
		double result = pi * a * a;
		
		System.out.println("원의 넓이 : " + result);
		return result;		
	}
	
}
