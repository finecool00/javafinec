package level0;

import java.util.Arrays;

public class quiz22 {

	
	public static void main(String[] args) {
		
		//문제 : 뒤에서 5등까지(lv0)
		
		/*
		 * 문제설명
		 * 정수로 이루어진 리스트 num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 반환
		 */
		
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		int[] answer = new int[5];
		
		Arrays.sort(num_list);
		
		
		for(int i = 0; i < num_list.length; i++) {
			
			if(i == 5) {
				break;
			}
			
			answer[i] = num_list[i];
			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
