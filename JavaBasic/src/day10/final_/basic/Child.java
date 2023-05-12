package day10.final_.basic;

public class Child extends Parent {
	//final 클래스 - 상속금지
	//final 메서드 - 오버라이드 금지
	
	//override
	public void method01() { 
		this.method02();
	}
	
	//public void method02()
}
