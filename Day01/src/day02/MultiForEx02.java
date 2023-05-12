package day02;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		//회전수가 변경되는 중첩반복문
		//i값에 따라서 j의 값을 변경
		//1-1
		//2-1
		//2-2
		//3-1
		//3-2
		//3-3
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);
			}
		}
		
		//별출력하기
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		//행
		for(int i = 1; i <= 5; i++) {
			//출력
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		   *
		  ***
		 *****
		*******
	   *********
		 */
		
		int star = 5;
		
		for(int i = 1; i <= star; i++) {
			//공백
			for(int j = 1; j <= (star - i); j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (i * 2 - 1); k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		     *
		    **
		   ***
		  ****
		 ***** 
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			//공백
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
