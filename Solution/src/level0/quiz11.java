package level0;

import java.util.Arrays;

public class quiz11 {

	
	public static void main(String[] args) {
		
		//문제 : 홀수 VS 짝수(lv0)
		
		/*
		 * 문제설명
		 * 주어지는 정수 리스트에서 홀수번째 원소의 합과 짝수번째 원소의 합을 비교하여
		 * 더 큰 값을 return(비교하는 두 값이 값을 경우 해당 값을 return) 
		 */
		
		
//		int[] num_list = {4, 2, 6, 1, 7, 6};
		int[] num_list = {-1, 2, 5, 6, 3};
	
		int answer = 0;
		
		int odd = 0;
		int even = 0;
		
		//홀수번째 요소 합 구하기
		for(int i = 0; i < num_list.length; i+=2) {
			odd += num_list[i];
		}
		
		//짝수번째 요소 합 구하기
		for(int i = 1; i < num_list.length; i+=2) {
			even += num_list[i];
		}
		
		System.out.println(odd);
		System.out.println(even);
		
		//값을 비교하여 값 return하기
		if(odd > even) {
			answer = odd;
		} else {
			answer = even;
		}
		
		System.out.println("정답 : " + answer);
	}
	
	
	
	
	
}
