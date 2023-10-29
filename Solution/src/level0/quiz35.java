package level0;

import java.util.Arrays;

public class quiz35 {

	
	public static void main(String[] args) {
		
		//문제 : 가장 큰 수 찾기(lv0)
		
		/*
		 * 문제설명
		 * 배열 array에서 가장 큰 수와 그 수의 인덱스 번호를 순서대로 넣은 새로운 배열 반환 
		 */
		
//		int[] array = {1, 8, 3};
		int[] array = {9, 10, 11, 8};
		
		int[] answer = new int[2];
		
		
		//방법 1
//		int index = 0;
//		
//		for(int i = 0; i < array.length - 1; i++) {
//			
//			if(array[i] > array[i + 1]) {
//				index = i;
//			} else if(array[i] < array[i + 1]) {
//				index = i + 1;
//			}
//			
//		}
//		
//		Arrays.sort(array);
//		
//		answer[0] = array[array.length - 1];
//		answer[1] = index;
		
		
		//방법2
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > answer[0]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		
		
		
		System.out.println(Arrays.toString(answer));
	}
	
	
}
