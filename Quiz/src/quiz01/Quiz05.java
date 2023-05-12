package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		 * 1. 하나의 정수를 입력 받습니다.
		 * 2. 이 정수가 짝수인지, 홀수인지, 음수인지, 0인지 판별하는
		 * 	  프로그램 코드를 작성을 해봅시다.
		 * 3 -> 홀수
		 * 0 -> 0입니다
		 * -1 -> 음수
		 * 2 -> 짝수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 > ");
		int a = scan.nextInt();
		
		if(a > 0) {
			if(a % 2 == 0) {
				System.out.println(a + "는 짝수입니다");
			} else {
				System.out.println(a + "는 홀수입니다");
			}
		} else if(a == 0) {
			System.out.println("0입니다");
		} else {
			System.out.println(a + "는 음수입니다");
		}
		scan.close();
		
	}
	
}
