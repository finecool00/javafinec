package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz28 {

	public static void main(String[] args) {
		
		//문제 : n의 배수 고르기(lv0)
		
		/*
		 * 문제설명
		 * numlist의 요소 중 n의 배수인 것만 골라 새로운 배열로 반환
		 */
		
		int n = 3;
//		int n = 5;
//		int n = 12;
		
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//		int[] numlist = {1, 9, 3, 10, 13, 5};
//		int[] numlist = {2, 100, 120, 600, 12, 12};
		
		//numlist 요소 중 n의 배수만 담을 리스트
		List<Integer> list = new ArrayList<>();
		
		
		//n의 배수인 요소만 리스트에 담는다
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
		
		//answer 배열의 크기는 list의 크기와 같다
		int[] answer = new int[list.size()];
		
		//리스트의 요소를 answer배열에 담는다
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	
}
