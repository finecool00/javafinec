package level0;

public class quiz31 {

	public static void main(String[] args) {
		
		//문제 : 대문자와 소문자(lv0)
		
		
		String my_string = "cccCCC";
//		String my_string = "abCdEfghIJ";
		
		String answer = "";
		
		//대소문자 판단하기 위해 String 배열로 쪼개기
		String[] arr = my_string.split("");
		
		//대소문자 판단 기준 변수
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		//요소별 대소문자 판단하여 변환한 값을 answer로 합침
		for(int i = 0; i< arr.length; i++) {
			if(lower.contains(arr[i])) {
				answer += arr[i].toUpperCase();
			} else if(upper.contains(arr[i])) {
				answer += arr[i].toLowerCase();
			}
		}
		
		System.out.println(answer);
		
	}
	
	
}
