package day07.override01;

public class Child extends Parent {

	/*
	 * 오버라이딩 규칙
	 * 1. 상속관계를 지녀야 합니다.
	 * 2. 부모 메서드와 모형이 같아야합니다.
	 * 
	 */
	
	void method02() {
		System.out.println("자식의 오버라이드된 2번 메서드");
	}
}
