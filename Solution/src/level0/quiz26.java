package level0;

import java.util.Arrays;

public class quiz26 {

	
	public static void main(String[] args) {
		
		//문제 : 순서바꾸기(lv0)
		
		/*
		 * 문제설명
		 * 정수리스트 num_list와 정수 n이 주어짐
		 * num_list의 n번째 요소 이후의 원소들을 0 ~ n번째 까지의 원소들 앞에 붙인 리스트 반환 
		 */
		
		int[] num_list = {2, 1, 6};
//		int[] num_list = {5, 2, 1, 7, 5};
		
		int n = 1;
//		int n = 3;
		
		
		//새로운 배열의 크기는 num_list의 크기과 같다
		int[] answer = new int[num_list.length];
		
		//새로운 배열의 순서를 고정하기 위한 변수
		int j = 0;
		
		//n번째 이후 요소를 먼저 answer배열에 담는다
		for(int i = n; i < num_list.length; i++) {
			
			answer[j] = num_list[i];
			
			j++;
			
		}
		
		//나머지 요소를 뒤에 담는다
		for(int i = 0; i < n; i++) {
			
			answer[j] = num_list[i];
			
			j++;
			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
