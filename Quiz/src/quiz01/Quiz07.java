package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1>");
		int a = scan.nextInt();
	 	
		System.out.print("연산을 선택하세요>");
		String s = scan.next();
		
		System.out.print("정수 2>");
		int b = scan.nextInt();
		
		switch ( s ) {
		case "+" :
			System.out.println("두 수의 덧셈은 : " + (a + b));
			break;
		case "-" :
			System.out.println("두 수의 뺄셈은 : " + (a - b));
			break;
		case "*" :
			System.out.println("두 수의 곱셈은 : " + (a * b));
			break;
		case "/" :
			System.out.println("두 수의 나눗셈은 : " + (a / b));
			break;

		default:
			System.out.println("연산자는 [+, -, *, /]중에서 선택해주세요!");
			break;
		}
		
		
		
	}
	
}
