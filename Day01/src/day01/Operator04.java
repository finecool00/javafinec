package day01;

public class Operator04 {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3; // a = a + 3 (a+3 값을 a에 대입)
		b =+ 3; // b = +3 (양수 3을 b에 대입 / 순서)
		
		System.out.println(a);
		System.out.println(b);
		
		a -= 4; //5
		a *= 10; //50
		a /= 5; // 10
		a %= 2; // 0
		
		//a ?
		System.out.println(a);
	}

}
