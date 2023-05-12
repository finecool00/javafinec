package day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		//Queue - First In First Out (FIFO - 선입선출)
		
		for(int i = 1; i <= 5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}
	}
	
	static int[] arr = {1, 2, 3};
	
	static void push(int data) {
		//1. 배열의 크기를 +1 한 새로운 배열만듦
		int[] temp = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length]= data;
		
		arr = temp;
		temp = null;
	}
	
	//배열의 맨 앞요소부터 삭제되도록 처리
	static int pop() {
		
		if(arr.length > 0) {
			
			//1. 삭제할 데이터 백업
			int del = arr[0];
			//2. arr - 1인 사본배열 생성
			int[] temp = new int[arr.length - 1];
			//3. 배열의 1번째 요소 ~ 마지막까지 옮겨 담는다.
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i + 1];
			}
			//4. 원본배열을 temp로 변경함
			arr = temp;
			temp = null; //temp 삭제
			
			return del;
		}
		return 0;
	}
	
}
