package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz24 {

	public static void main(String[] args) {
		
		//문제 : 배열의 원소 삭제하기(lv0)
		
		/*
		 * 문제설명
		 * 정수배열 arr, delete_list가 주어짐
		 * arr 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소를
		 * 기존 arr원소의 순서를 유지한 배열을 반환
		 */
		
		
		int[] arr = {293, 1000, 395, 678, 94};
//		int[] arr = {110, 66, 439, 785, 1};
		
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
//		int[] delete_list = {377, 823, 119, 43};
		
		
		//delete_list에 있는 수를 제외(0으로 만듦)하는 리스트(list)
		//0을 뺀 남는 원소만 순서대로 넣기 위한 리스트(list2)
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		int[] answer = {};
		
		//비교하여 delete_list의 숫자가 arr에 포함되어 있으면 0으로 만들어 제외시킨다
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < delete_list.length; j++) {
				
				if(arr[i] == delete_list[j]) {
					arr[i] = 0;
				}
				
			}
			//리스트에 담는다
			list.add(arr[i]);
		}
		
		//0이 아닌 수만 list2에 담는다
		for(int a : list) {
			
			if(a != 0) {
				
				list2.add(a);

			}
		}
		
		//답을 반환할 배열의 크기는 list2의 크기와 같다
		answer = new int[list2.size()];
		
		//list2의 요소를 answer배열로 옮긴다
		for(int i = 0; i < list2.size(); i++) {
			answer[i] = list2.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	
}
