package level0;

public class quiz13 {

	
	public static void main(String[] args) {
		
		//문제 : 특정한 문자를 대문자로 바꾸기(lv0)
		
		/*
		 * 문제설명
		 * 소문자로 이루어진 문자열 my_string, 소문자 1글자로 이루어진 문자열 alp가 주어짐
		 * my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return할 것
		 * (없을 경우 그대로의 my_string을 return) 
		 */
		
//		String my_string = "programmers";
		String my_string = "lowercase";
		
//		String alp = "p";
		String alp = "x";
		
		String answer = "";
		
		if(my_string.contains(alp)) {
			my_string = my_string.replace(alp, alp.toUpperCase());
		} else {
			answer = my_string;
		}
		
		System.out.println(answer);
		
	}
	
	
}
