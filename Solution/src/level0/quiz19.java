package level0;

import java.util.Arrays;

public class quiz19 {

	
	public static void main(String[] args) {
		
		//문제 : 문자열 바꿔서 찾기(lv0)
		
		/*
		 * 문제설명
		 * A와 B로 이루어진 문자열 myString과 pat이 주어짐
		 * myString의 문자열의 A -> B, B -> A로 변환
		 * 바뀐 문자열의 부분문자열 중 pat과 같은 것이 있는지 확인 
		 * 있으면 1, 없으면 0 반환
		 */
		
		
		String myString = "ABBAA";
//		String myString = "ABAB";
		
		String pat = "AABB";
//		String pat = "ABAB";
		
		//myString을 배열로 변환
		String[] arr = myString.split("");
		
		//바뀐 문자열을 담을 변수 지정
		String newString = "";
		
		int answer = 0;
		
		//A -> B, B -> A 변환 후 newString에 모아 새로운 문자열 만듦
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("A")) {
				arr[i] = "B";
			} else {
				arr[i] = "A";
			}
			
			newString += arr[i];
		}
		
		//새로운 문자열에 pat 포함 여부 판단하여 값 반환
		if(newString.contains(pat)) {
			answer = 1;
		}
		
		System.out.println(answer);
	}
	
}
