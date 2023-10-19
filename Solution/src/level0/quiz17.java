package level0;

import java.util.Arrays;

public class quiz17 {

	
	public static void main(String[] args) {
		
		//문제 : 공백으로 구분하기2(lv0)
		
		String my_string = " i    love  you";
//		String my_string = "    programmers  ";
		
		//앞뒤 공백 제거
		my_string = my_string.trim();
		
		//정규표현식(\s+ : 공백 1개 이상) 활용하여 공백 1칸만 남기고 제거(치환)
		my_string = my_string.replaceAll("\\s+", " ");
		
		//문자열 배열로 자르기
		String[] answer = my_string.split(" ");
		
		System.out.println(Arrays.toString(answer));
		
		
	}
	
	
}
