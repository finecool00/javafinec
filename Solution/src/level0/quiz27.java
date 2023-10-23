package level0;

public class quiz27 {

	public static void main(String[] args) {
		
		//문제 : A강조하기(lv0) -> 4점 획득
		
		/*
		 * 문제설명
		 * 문자열 myString이 주어짐
		 * myString에 등장하는 "a"는 전부 "A"로 변환
		 * "A"가 아닌 모든 대문자는 소문자로 변환
		 * 
		 * 아래 방식으로 진행할 것임
		 * => 단계 1 : 모두 소문자로 변환(toLowerCase() 사용)
		 *    단계 2 : "a" -> "A"로 치환(replace 사용)
		 */
		
		
		String myString = "abstract algebra";
//		String myString = "PrOgRaMmErS";
		
		String answer = "";
		
		//1단계 : 모든 문자를 소문자로 만들기
		myString = myString.toLowerCase();
		
		//2단계 : 모든 a를 A로 치환
		answer = myString.replace("a", "A");
		
		
		System.out.println(answer);
	}
	
	
}
