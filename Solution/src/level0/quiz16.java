package level0;

import java.util.Arrays;

public class quiz16 {

	public static void main(String[] args) {
		
		//문제 : 원하는 문자열 찾기(lv0)
		
		String myString = "abcdevwxyz";
//		String myString = "jjnnllkkmm";
		
		//l보다 작은 문자열들(판단의 기준)
		String standard = "abcdefghijk";
		
		String answer = "";
		
		//myString을 문자열 배열로 나눔
		String[] arr = myString.split("");
		
		//배열의 각 요소가 standard에 포함되면 l로 바꿈
		for(int i = 0; i < arr.length; i++) {
			
			if(standard.contains(arr[i])) {
				arr[i] = arr[i].replace(arr[i], "l");
			}
			
		}
		
		//배열 요소를 문자열로 합침(향상된 for문 활용)
		for(String b : arr) {
			answer += b;
		}
		
		System.out.println(answer);
	}
	
	
}
