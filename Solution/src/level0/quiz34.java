package level0;

import java.util.Arrays;

public class quiz34 {

	public static void main(String[] args) {
		
		//문제 : x 사이의 개수
		
		/*
		 * 문제설명
		 * 주어진 문자열 myString을 문자 x 기준으로 나눴을 때
		 * 각각 나눠진 문자열의 길이를 순서대로 저장한 배열을 반환 
		 * 
		 */
		
		
		String myString = "oxooxoxxox";
//		String myString = "xabcxdefxghi";
		
		int count = 0;
		
		for(int i = 0; i < myString.length(); i++) {
			
			if(myString.charAt(i) == 'x') {
				count++;
			}
			
		}
		
		int[] answer = new int[count + 1];
		
		int countO = 0;
		int j = 0;
		
		for(int i = 0; i < myString.length(); i++) {
			
			if(myString.charAt(i) != 'x') {
				countO++;
				continue;
			} else {
				answer[j] = countO;
				j++;
				countO = 0;
				continue;
			}
		
		}
		
		answer[j] = countO;
				
		System.out.println(Arrays.toString(answer));
		
	}
	
	
}
