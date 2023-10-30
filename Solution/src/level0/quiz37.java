package level0;

import java.util.Arrays;

public class quiz37 {

	public static void main(String[] args) {
		
		//문제 : 문자열 정렬하기(1)(lv0)
		
		/*
		 * 문제설명
		 * 매개변수 my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 반환
		 * 
		 * 접근
		 * 1. 문자열 my_string에서 정규표현식을 사용하여 숫자만 골라낸다
		 * 2. 정수 리스트로 만든다(split, 반복문, 형변환 사용)
		 * 3. 리스트 내 두 수를 비교하여 오름차순 정렬
		 * 참고(정렬은 Arrays.sort() 사용해도 됨)
		 */
		
		String my_string = "hi12392";
//		String my_string = "p2o4i8gj2";
//		String my_string = "abcde0";
		
		//정규표현식으로 알파벳 제외
		my_string = my_string.replaceAll("[a-zA-Z]", "");
		
		//문자열 리스트로 변환
		String[] arr = my_string.split("");
		
		//return할 리스트(arr과 크기가 같음)
		int[] answer = new int[arr.length];
		
		//문자열 -> 정수 형변환하여 값을 answer 리스트에 담는다
		for(int i = 0; i < arr.length; i++) {
			
			answer[i] = Integer.parseInt(arr[i]);
			
		}
		
		//두 요소를 비교하여 옮길 요소 하나를 임시로 담는 그릇 역할
		int[] temp = new int[1];
		
		//두 수를 비교하여 오름차순 정렬
		for(int i = 0; i < answer.length - 1; i++) {
			
			for(int j = i + 1; j < answer.length; j++) {
								
				if(answer[i] > answer[j]) {
					
					temp[0] = answer[i];
					answer[i] = answer[j];
					answer[j] = temp[0];
					
				}
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	
}
