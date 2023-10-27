package level0;

import java.util.Arrays;

public class quiz32 {

	
	public static void main(String[] args) {
		
		//문제 : 최댓값 만들기(2) - 2점 획득
		
		/*
		 * 문제설명
		 * 정수배열 numbers의 원소 중 두개를 곱해 만들 수 있는 최댓값을 반환
		 * 
		 * 접근
		 * 곱이므로 음수 * 음수가 최대이거나, 양수 * 양수가 최대일 경우를 비교하여 구하면 됨
		 * 1단계 : 정렬
		 * 2단계 : (최솟값 * 바로 다음 값)과 (최댓값 * 바로 전 값) 비교
		 */
		
		int[] numbers = {1, 2, -3, 4, -5};
//		int[] numbers = {0, -31, 24, 10, 1, 9};
//		int[] numbers = {10, 20, 30, 5, 5, 20, 5};

		int answer = 0;
		
		Arrays.sort(numbers);
		
		int min = numbers[0] * numbers[1];
		int max = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		
		if(min >= max) {
			answer = min;
		} else {
			answer = max;
		}
		
		System.out.println(answer);
	}
	
}
