package quiz01;

import java.lang.*;
import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
//		int correct = 0;
//		int fail = 0;

//		while (true) {
//			
//			int a = (int)(Math.random()*101);
//			int b = (int)(Math.random()*101);
//			int c = (int)(Math.random()*2);
//			
//			System.out.println("-----------------------");
//			
//			
//			  if(c == 1) {
//			  System.out.println(a + " + " + b + " = ?");
//			  } else {
//			  System.out.println(a + " - " + b + " = ?");
//			  }
			 
			//나만의 복잡한 방법~(아래 if구문 만)
//			if(a % 2 == 0) {
//				System.out.println(a + " + " + b + " = ?");
//				
//			} else {
//				System.out.println(a + " - " + b + " = ?");
//			}
			
//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//			
//			System.out.print(">");
//			
//			int answer = scan.nextInt();
//			
//			if(answer == (a + b) || answer == (a - b)) {
//				System.out.println("정답입니다");
//				correct++;
//			} else if(answer == 0) {
//				System.out.println("프로그램 정상 종료");
//				System.out.println("정답 : " + correct);
//				System.out.println("오답 : " + fail);
//				break;
//			} else {
//				System.out.println("틀렸습니다");
//				fail++;
//			}
//			
//			
//		}
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			int num1 = (int)(Math.random()*101);
			int num2 = (int)(Math.random()*101);
			int oper = (int)(Math.random()*2);
			
			System.out.println("------------------------");
			System.out.println(num1 + (oper == 0 ? " + " : " - ") + num2 + " = ?");
			//3항 연산식을 위의 방식으로도 사용 가능
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.println(">");
			int answer = scan.nextInt();
			
			int correct = oper == 0 ? num1 + num2 : num1 - num2; //실제정답
			
			if(answer == 0) {
				System.out.println("정답횟수:" + okCount);
				System.out.println("오답횟수:" + noCount);
				break;
			}
			if(answer == correct) { //
				System.out.println("정답입니다");
				okCount++;
			} else {
				System.out.println("틀렸습니다");
				noCount++;
			}
		}
		
	}
	
}
