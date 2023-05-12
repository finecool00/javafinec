package day04;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		//배열의 한계점 -> 크기가 정적
		//Stack - Last In First Out ( LIFO )
		
		// push 관련 내용 다시 볼것!!!!!!!!!!!!!!!!!!
		
		push(4);
		push(5);
		
		System.out.println(Arrays.toString(arr));
		
		pop();
		int r = pop(); //삭제된 데이터도 확인이 가능함
		System.out.println("삭제된 데이터 : " + r);
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] arr = {1, 2, 3};
	
	//push -> 특정요소를 마지막에 추가
//	static int push(int data) {
//		
//	}
	
	static void push(int data) {
		
		int[] temp = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		temp[arr.length] = data; 
		
		arr = temp;
		temp = null;
	}
	
	//pop -> 특정요소를 마지막에서 삭제(반환 - 삭제된데이터)
	static int pop() {
		if(arr.length > 0) {
			//1. 삭제할 데이터를 백업
			int del = arr[arr.length - 1];
			//2. arr보다 -1인 사본배열 생성
			int[]temp = new int[arr.length - 1];
			//3. 원본배열을 사본으로 복사(맨마지막 데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			//4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null; //temp 삭제
			
			return del; //삭제된 데이터 반환
		}
		return 0;
	}
	
}
