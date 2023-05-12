package quiz18;

import java.util.Arrays;

public class StringQuiz03 {

	public static void main(String[] args) {
		//회문비교 -> "다시 합창 합시다"
	    /*
	    1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
	    2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
	    3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
	    4. 문장은 공백을 포함하여 받을 수 있습니다.
	    5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	       조건
	       빌더의 reverse() 는 금지 입니다.
	      
	    6. 힌트)
	    * 공백은 없어져야 비교가 됩니다. 
	    * 회문은 첫글자와, 마지막글자 가 똑같습니다.
	    * 
	    */
		
//		String result = palindrome("아 좋다 좋아");
//		System.out.println(result);
		
		String result = palindrome("아 좋다 좋아");
		System.out.println(result);
		String result2 = palindrome("다시 합창 합시다");
		System.out.println(result2);
		String result3 = palindrome("다 같은 것은 같다");
		System.out.println(result3);
		String result4 = palindrome("소주 만 병만 주소딩");
		System.out.println(result4);
		String result5 = palindrome("여보 안경 안 보여");
		System.out.println(result5);
		String result6 = palindrome("다시 합창 홍시다");
		System.out.println(result6);
	}
	public static String palindrome(String word) {
// 나의 풀이	
//		
//		String newWord = word.replace(" ", "");
//		int j = newWord.length() - 1;
//		
//		for(int i = 0; i < newWord.length() / 2; i++) {
//			if(newWord.charAt(i) == newWord.charAt(j)) {
//				j--;
//			} else {
//					return "회문이 아닙니다";
//			}
//		}
//		return "회문입니다";
	
	//선생님 풀이
		
//		word = word.replace(" ", "");
//		
//		for(int i = 0; i < word.length() / 2; i++) {
//			
//			char a = word.charAt(i); //앞에서 움직이는 커서
//			char b = word.charAt(word.length() - i - 1); //뒤에서 움직이는 커서
//			
//			if(a != b) {
//				return "회문이 아님";
//			}
//			
//		}
//		
//		return "회문"; //"회문이 아님";
		
		//Builder와 reverse() 사용한 방법
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);
		
		return sb.reverse().toString().equals(word) ? "회문" : "회문이 아님";
	}
	
}
