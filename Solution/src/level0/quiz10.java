package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz10 {

	
	public static void main(String[] args) {
		
		
		//문제 : 마지막 두 원소(lv0)
		
		/*
		 * 문제설명 : 주어지는 정수 리스트의 마지막 요소와 직전 요소를 비교하여
		 * 마지막 요소 > 직전요소일 경우 : 마지막 원소값 - 직전 원소 값을 추가
		 * 그 외의 경우 마지막 원소값 * 2 값을 추가
		 */
		
//		int[] num_list = {2, 1, 6};
		int[] num_list = {5, 2, 1, 7, 5};
		
		int last = num_list.length - 1;
		int[] answer = new int[num_list.length + 1];

		int new_last = answer.length - 1;
		
		for(int i = 0; i < num_list.length; i++) {
			
			answer[i] = num_list[i];
			
		}
		
		if(num_list[last] > num_list[last - 1]) {
			answer[new_last] = num_list[last] - num_list[last - 1];
		} else {
			answer[new_last] = num_list[last] * 2;
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		//방법 2 : list 활용
		
//		List<Integer> new_list = new ArrayList<>();
//		
//		for(int i = 0; i < num_list.length; i++) {
//			
//			new_list.add(num_list[i]);
//		}
//		
//		if(num_list[last] > num_list[last - 1]) {
//			new_list.add(num_list[last] - num_list[last - 1]);
//		} else {
//			new_list.add(num_list[last] * 2);
//		}
//		
//		System.out.println(new_list.toString());
		
	}
	
}
