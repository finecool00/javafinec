package level0;

public class quiz29 {

	public static void main(String[] args) {
		
		
		//문제 : 가위바위보(lv0)
		
		/*
		 * 가위 = 2, 바위 = 0, 보 = 5
		 * 상대방이 내는 수를 rsp라고 할 때
		 * 모두 이기는 수를 반환
		 */
		
		String rsp = "2";
//		String rsp = "205";
		
		String answer = "";
		
		for(int i = 0; i < rsp.length(); i++) {
			
			switch (rsp.charAt(i)) {
				
				case '2':
				
					answer += "0";
					
					break;

				case '0':
					
					answer += "5";
					
					break;
				
				case '5':
					
					answer += "2";
					
					break;

			default:
				break;
			}
			
		}
		
		System.out.println(answer);
	}
	
	
}
