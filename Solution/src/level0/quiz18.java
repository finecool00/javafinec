package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz18 {

	
	public static void main(String[] args) {
		
		//문제 : 배열의 원소만큼 추가하기
		
		/*
		 * 문제설명
		 * 빈 배열 answer에 주어진 배열 arr의 각 요소 수를 해당 숫자 만큼 반복해서 추가
		 * answer를 return 
		 */
		
		int[] arr = {5, 1, 4};
//		int[] arr = {6, 6};
//		int[] arr = {1};
		
		//빈 배열의 사이즈를 구하기 위한 변수
		int size = 0;
		
		//빈 배열 사이즈 구하기
		//사이즈는 각 요소의 합과 같다
		for(int i = 0; i < arr.length; i++) {
			size += arr[i];
		}
		
		//앞서 구한 사이즈에 맞는 빈 배열 만들기
		int[] answer = new int[size];
		
		//요소 수 만큼 반복되어 추가된 리스트 구하기
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				list.add(arr[i]);
			}
		}
		
		//리스트 값을 배열로 옮기기
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		
		System.out.println(Arrays.toString(answer));
		
		
	}
	
}
