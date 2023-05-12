package day02;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		//선언문은 반복문 밖에 적는 것이 낫다
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("4 x 3 = ?>");
			System.out.print("정답>");
			int answer = scan.nextInt();
			
			if(answer == 12) { //정답
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다. 다시 푸세요!");
			}
		}
	}
	
} 
