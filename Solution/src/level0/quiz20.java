package level0;

public class quiz20 {

	
	public static void main(String[] args) {
		
		//부분 문자열 이어 붙여 문자열 만들기(lv0)
		
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		
		String answer = "";
		
		
		/*
		 * 문제설명
		 * my_strings 각 요소의 문자열에 parts 요소 만큼 자른 부분 문자열을
		 * 합친 새로운 문자열을 반환할 것 
		 */
		
		for(int i = 0; i < my_strings.length; i++) {
			
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
				
		}
		
		System.out.println(answer);
		
	}
	
}
