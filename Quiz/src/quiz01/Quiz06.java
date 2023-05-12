package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력.(조건 - 같은수는 없다고 가정)
		 * 
		 * 입력 예
		 * 15, 30, 7 -> max : 30, mid : 15, min : 7
		 * 1, 2, 3 -> max : 3, mid : 2, min : 1
		 * 
		 * 힌트
		 * a가 가장 클 때의 조건(a > b && a > c)
		 * 
		 */
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 1>");
		int a = scan.nextInt();
		System.out.print("입력 2>");
		int b = scan.nextInt();
		System.out.print("입력 3>");
		int c = scan.nextInt();
		
		if(a > b && a > c) {
			if(b > c) {
				max = a;
				mid = b;
				min = c;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			} else {
				max = a;
				mid = c;
				min = b;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			}
		} else if (b > a && b > c) {
			if(a > c) {
				max = b;
				mid = a;
				min = c;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			} else {
				max = b;
				mid = c;
				min = a;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			}
		} else if (c > a && c > b) {
			if(a > b) {
				max = c;
				mid = a;
				min = b;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			} else {
				max = c;
				mid = b;
				min = a;
				System.out.print("max : " + max);
				System.out.print(", mid : " + mid);
				System.out.println(", min : " + min);
			}
		}
		
			
		scan.close();
		
		
		
		
		
	}
	
}
