package level0;

public class quiz15 {

	
	public static void main(String[] args) {
		
		//문제 : 문자열 정수의 합
		
		/*
		 * 문제설명
		 * 주어진 문자열(정수로 이루어짐)에서 각 자리수의 합을 return 
		 */
		
		String num_str = "123456789";
//		String num_str = "1000000";
		
		int answer = 0;
		
		for(int i = 0; i < num_str.length(); i++) {
			
			
			//각 자리수(char형식)을 int로 형 변환하여 더함
			answer += Character.getNumericValue(num_str.charAt(i));

		}
		
		System.out.println(answer);
		
	}
	
	
}
