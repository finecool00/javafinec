package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//swtich문장의 else if문과 상당히 유사함
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력>");
		int point = scan.nextInt();
		
		//변수의 연산식이 들어갈 수 있습니다.
		switch (point / 10) {
		
		case 10 :
			System.out.println("만점입니다!! A+학점");
			break;
		case 9: //case에 조건문이 들어갈 수 있다!
			
			if(point >= 90) { 
			//여기서 point는 switch문 초입에 연산된 데이터가 아니라 원래 데이터임
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			System.out.println("상위 10프로네요!");
			
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("재수강입니다ㅠㅠ");
			break;
		}
		
	}
	
}
