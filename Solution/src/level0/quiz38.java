package level0;

import java.util.Arrays;

public class quiz38 {

	public static void main(String[] args) {
		
		//문제 : 인덱스 바꾸기(lv0)
		
		/*
		 * 문제설명
		 * 매개변수 문자열 my_string, 정수 num1, 정수 num2가 주어짐
		 * my_string에서 num1번째 문자와 num2번째 문자를 바꾼 문자열 반환
		 * 
		 * 접근
		 * split으로 문자열을 배열로 변환
		 * 임시배열 temp를 이용하여 값 변경
		 * 향상된 for문으로 문자열로 만들기
		 */
		
		String my_string = "hello";
//		String my_string = "I love you";
		
		int num1 = 1;
//		int num1 = 3;
		
		int num2 = 2;
//		int num2 = 6;
		
		//리스트로 만들기
		String[] arr = my_string.split("");
		
		//임시배열
		String[] temp = new String[1];
		
		String answer = "";
		
		//값 바꾸기
		temp[0] = arr[num1];
		
		arr[num1] = arr[num2];
		
		arr[num2] = temp[0];
		
		//배열 -> 문자열로 변환
		for(String a : arr) {
			answer += a;
		}
		
		System.out.println(answer);
		
		
	}
	
}
