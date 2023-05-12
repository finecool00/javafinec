package day12.api.lang.wrapper;

public class AutoBoxingEx {

	public static void main(String[] args) {
		
		//Autoboxing : 기본타입 ~ 클래스형 간 자동형변환
		Integer val1 = 100; // wrapper타입 변수 선언 때 초기화도 할 수 있다
		int b = val1;
		
		Double val2 = 3.14;
		double c = val2;
		
		//래퍼클래스의 특별한 기능들
		//형변환
		int result1 = Integer.parseInt("10");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		
		System.out.println(result1 + result2 + result3);
		
		
		System.out.println(Integer.compare(3, 5)); //앞의 값이 뒤의 값보다 작으면 음수
		System.out.println(Integer.compare(5, 3)); //앞의 값이 뒤의 값보다 크면 양수
		System.out.println(Integer.compare(5, 5)); //앞의 값이 뒤의 값과 같으면 0
		
		
		
		
		
	}
	
	
}
