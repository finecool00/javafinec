package day12.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		//next, nextInt, nextDouble, nextLine
		
		System.out.println("정수>");
		int num = scan.nextInt(); // 12엔터 - 엔터기준 앞까지만 받음
		
		scan.nextLine(); //엔터를 소비
		
		System.out.println("문자열>");
		String info = scan.nextLine(); //xxx엔터 - 엔터를 포함해서 받음
		
		System.out.println(num);
		System.out.println(info);
		*/
		
		while(true) {
			try {
				System.out.println(">");
				int num = scan.nextInt(); //문자 엔터값을 정상적으로 처리를 못해서
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				scan.nextLine(); //문자 + 엔터값을 대신처리
			}
		}
	}
	
}
