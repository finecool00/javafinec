package day01;

public class Operator05 {

	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 값을 발생시키는 기능
		//System.out.println(Math.random()); //1미만의 랜덤한 double값
		
		//1~10까지 랜덤한 값
		double d = Math.random() * 10; // 0이상 10미만의 실수 범위를 가진다
		int a = (int)d + 1; // 범위 : 1 ~ 10
		System.out.println("1~10까지 랜덤수:" + a);
		
		//한번에 적으면?
		int result = (int)(Math.random() * 10) + 1;
		System.out.println(result);
		
		//3항연산식
		//조건 ? 연산1 : 연산2
		
		String s = result % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result + "는" + s);
	}
	
}
