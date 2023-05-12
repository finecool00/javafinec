package quiz01;

import java.util.Scanner;

public class Quiz14 {

	/* => 문제출처 : 
	 * 1. 가로, 세로 길이를 입력을 받습니다.
	 * 2. 가로, 세로 길이만큼 사각형을 출력합니다.
	 * 3. 단, 윤곽만 나오면 됩니다.
	 * 
	 * 힌
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.print("세로>");
		int b = scan.nextInt();
		//행
		for(int i = 1; i <= b; i++) {
			if(i == 1 || i == b) {
				for(int j = 1; j <= a; j++) {
					System.out.print("*");
				}
			System.out.println();
			} else {
				//열
				for(int k = 1; k <= a; k++) {
					if(k == 1 || k == a) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}
	
}
