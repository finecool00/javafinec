package level0;

public class quiz14 {

	public static void main(String[] args) {
		
		//문제 : 접미사인지 확인하기(lv0)
		
		/*
		 * 문제설명
		 * 문자열 my_string과 is_suffix가 주어짐
		 * is_suffix가 my_string의 접미사이면 1 return, 아니면 0 return
		 * 
		 * 예 : my_string이 banana라면
		 * 접미사는 banana, anana, nana, ana, na, a
		 */
		
		
		String my_string = "banana";
		
		String is_suffix = "ana";
//		String is_suffix = "nan";
//		String is_suffix = "wxyz";
//		String is_suffix = "abanana";
		
		int answer = 0;
		
		for(int i = 0; i <= my_string.length(); i++) {
		
			if(is_suffix.equals(my_string.substring(i))) {
				answer = 1;
				System.out.println(answer);
				break;
			}
			
		}
		
		System.out.println(answer);
		
	}
	
	
}
