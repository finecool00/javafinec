package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속받은
		c.method02(); //오버라이드된
		c.method03(); //내꺼
		
		
		System.out.println("==========다형성 적용(형변환)==========");
		
		//Parent처럼 사용됩니다. 단, 자식의 오버라이드된 메서드는 우선 실행됩니다.
		Parent p = c;
		p.method01();
		p.method02(); //Child의 오버라이드된 메서드 실행
		//p.method03(); //Parent의 메서드만 실행되므로 에러

		System.out.println(p); //parent타입
		System.out.println(c); //child타입
		System.out.println(p == c); //child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("==========클래스 강제 형변환==========");
		//원본이 child로 생성되었다면, 강제 형변환 가능
		
		Parent pp = new Child();
		System.out.println(pp); //child원본
		
		Child cc = (Child)pp; //강제 형변환
		cc.method01();
		cc.method02();
		cc.method03();
		
		//주의할 점 => 다형성이 적용되었던 객체만 강제 형변환 가능함!
		Object obj = new Object();
		//Child ccc= (Child)obj; //문제 없어 보이지만 runtime exception 에러가 뜰 것!!
		
		System.out.println("==========다형성의 또다른 예시==========");
		
		String str = "홍길동";
		Object o = str;
		
		System.out.println(o);
		
		String result = (String)o; //가능!
		
	}
	
}
