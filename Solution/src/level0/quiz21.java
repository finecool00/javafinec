package level0;

public class quiz21 {

	
	public static void main(String[] args) {
		
		//문제 : 0 떼기(lv0)
		
		/*
		 * 문제설명
		 * 정수로 이루어진 문자열 n_str에서 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문제열을 반환할 것 
		 */
		
		
		String n_str = "0010";
//		String n_str = "854020";
		
		String answer = "";
		
		//0이 아닌 문자의 인덱스번호를 찾기 위한 변수
		int count = 0;
		
		//0이 아닌 문자의 인덱스번호 찾기
		for(int i = 0; i < n_str.length(); i++) {
			
			if(n_str.charAt(i) != '0') {
				break;
			}
			
			count++;
		}
		
		//count 부터 끝까지 문자열 자르기
		answer = n_str.substring(count); 
		
		System.out.println(answer);
	}
	
	
}
