package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

	//사용
	A a = new A(); //public O
	//A a2 = new A(1); //default X
	//A a3 = new A("홍길동"); //private X
	
	public C() {
		a.var1 = 1;
		//a.var2 = 2; //default X
		//a.var3 = 3; //private X
		
		a.method1();
		//a.method2(); //dafault X
		//a.method3(); //private X
		
		
	}
	
	
}
	