package level0;

import java.util.Scanner;

public class quiz33 {

	
	public static void main(String[] args) {
		
		
		//문제 : 직각삼각형 출력하기(lv0)
		//별찍기 문제다!
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();

		}
	}
	
	
	
}
