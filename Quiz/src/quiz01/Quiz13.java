package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력
		
		for(int i = 7; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println(); //줄바꿈
		
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력
		
		int count = 0;
		
		for(int a = 1; a <= 200; a++) {
			if(a % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수는 " + count + "개 입니다");
		
		//3. 50~100사이의 두 수 사이의 합
		
		int sum = 0;
		
		for(int b = 50; b <= 100; b++) {
			sum += b;
		}
		System.out.println("50~100까지의 합은 " + sum + "입니다");
		
		//4. A~Z까지 가로로 붙여서 출력, A = 65, Z = 90
		
		for(char al = 'A'; al <= 'Z'; al++) {
			System.out.print(al + " ");
			//다른 방법 : 문자열 누적
			//String str = ""
			//for(char c = 'A'; c <= 'Z'; c++) {
			//str += c;
		}
		//System.out.println(str);
		System.out.println();
		
		//5. 입력받은 정수까지 팩토리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int mul = 1;
				
		for(int x = 1; x <= num; x++) {
			mul *= x;
		}
		System.out.println(num + "팩토리얼 = " + mul);
	}
	
}
