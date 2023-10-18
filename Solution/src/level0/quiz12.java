package level0;

public class quiz12 {

	
	public static void main(String[] args) {
		
		//문제 : 글자 이어 붙여 문자열 만들기(lv0)
		
		/*
		 * 문제설명
		 * 주어진 문자열 my_string을
		 * 배열 index_list의 요소값 번째 문자로 새로운 문자를 만들어내는 문제 
		 */
		
//		String my_string = "cvsgiorszzzmrpaqpe";
		String my_string = "zpiaz";
		
//		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		int[] index_list = {1, 2, 0, 0, 3};
		
		String answer = "";
		
		for(int i = 0; i < index_list.length; i++) {
			
			answer += my_string.charAt(index_list[i]);
			
		}
		
		
		System.out.println(answer);
		
		
	}
	
}
