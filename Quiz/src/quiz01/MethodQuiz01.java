package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		
		String r1 = method2("가");
		System.out.println(r1);

		double r2 = method3(1, 2, 3.0);
		System.out.println(r2);
		
		String r3 = method4(3);
		System.out.println(r3);
		
		method5("나", 3);
		
		int r4 = maxNum(1, 2);
		System.out.println(r4);
		
		int r5 = abs(-5);
		System.out.println(r5);
		
		String rr = java(4);
		System.out.println(rr);
		
	} //main
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		return s;
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	static String method4(int a) {
		//방법 1
//		String str = "";
//		if(a % 2 == 0) {
//			str = "짝수";
//		} else {
//			str = "홀수";
//		}
//		return str;
		
		//방법 2
//		if(a % 2 == 0) {
//			return "짝수";
//		} else {
//			return "홀수";
//		}
		
		//방법 3
		return a % 2 == 0 ? "짝수" : "홀수";
	}
	
	static void method5(String s, int a) {
//		String str = "";
//		for(int i = 1; i <= a; i++) {
//			str += i;
//		}
//		System.out.println(str);
		
		for(int i = 1; i <= a; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
//		int max = 0;
//		
//		if(a > b) {
//			max = a;
//		} 
//		if(a < b) {
//			max = b;
//		}
//		return max;
		
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static int abs(int a) {
		
//		if(a > 0) {
//			System.out.println(a);
//		}
//		if(a < 0 ) {
//			System.out.println(-a);
//		}
//		
//		return a;
		
		return a > 0 ? a : -a;
	}
	
	static String java(int a) {
		
		String str = "";
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				str += "자";
			} else {
				str += "바";
			}
		}
		
		return str;
	}

}

