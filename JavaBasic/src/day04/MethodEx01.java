package day04;

public class MethodEx01 {

	
	
	public static void main(String[] args) {
		
		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성할 수 없습니다.(따로 만들어야된다!?) 
		 */
		
		//재활용 가능
		System.out.println("1~10까지 합 : " + calSum());
		System.out.println("1~10까지 합 : " + calSum());
		System.out.println("1~10까지 합 : " + calSum());

		int result = calSum(); //호출받은 값을 또 다른 변수에 담을 수 있음
		System.out.println("1~10까지 합 : " + result);
		
		String result2 = calSum2();
		System.out.println(result2);
		
		
		
	} //여기까지 main
	//반환유형 O, 매개변수 X
	//반환유형 이름()
	static int calSum() {
		
		//1~10까지 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum; //합계를 반환
	}
	
	//문자열 반환
	static String calSum2() {
		
		//A~Z문자열 합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str; //문자열 반환
		
	}
	
}
