package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz39 {

	public static void main(String[] args) {
		
		//문제 : 콜라츠 수열 만들기(lv0)
		
		/*
		 * 문제설명
		 * 자연수 n이 짝수일 때는 2로 나누고, 홀수일 때는 3 * n + 1한 값으로 바꾸며
		 * 각 단계에서의 숫자를 리스트로 만든다(리스트 시작은 최초 n부터) 
		 */
		
		int n = 10;
		
		int i = 0;
		
		//리스트 객체 생성
		List<Integer> list = new ArrayList<>();
		
		//최초 n을 리스트에 담는다
		list.add(n);
		
		//n값이 1보다 클 때까지만! 짝수 홀수 판단하여 값을 리스트에 담는다
		while(n > 1) {
			
			if(n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			
			list.add(n);
			
			i++;
			
		}
		
		//리스트 크기만큼 answer배열 크기 지정
		int[] answer = new int[list.size()];
		
		//list 요소를 answer배열에 담는다
		for(int j = 0; j < answer.length; j++) {
			
			answer[j] = list.get(j);
			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	
}
