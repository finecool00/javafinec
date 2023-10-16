package level0;

public class quiz07 {

	public static void main(String[] args) {
		
		
		//문제 : 수 조작하기 2(lv0)
		
		/*
		 * 문제설명
		 * 배열 numLog의 숫자는 numLog[0]부터 일정한 규칙에 의해 구성됨
		 * w : 이전요소 + 1, s : 이전요소 - 1, d : 이전요소 + 10, a : 이전요소 - 10
		 * 결과값은 이전요소에서 w, s, d, a 중 어떤 규칙에 따라 다음요소가 결정되었는지를 판단하여 표시할 것
		 */
		
		
		int[] numLog = {0, 1, 0, 10, 0, 1, 0 ,10, 0, -1, -2, -1};
		
		/*
		 * 다음요소 - 이전요소로 어떤 규칙을 따랐는지 알 수 있음
		 * 예 : numLog[1] - numLog[0] = 1 - 0 = 1 => 1증가(=w)
		 * 예 : numLog[11] - numLog[10] = -1 -(-2) = -1 + 2 = 1 => 1증가(=w)
		 */ 
		
		String answer = "";
		
		//n회차 반복에서 n+1값도 같이 사용해야하기 때문에 배열크기 -1 미만으로 범위 설정
		for(int i = 0; i < numLog.length - 1; i++) {
			
			
			switch (numLog[i + 1] - numLog[i]) {
				
				case 1:
					
					answer += "w";
					
					break;
	
				case -1:
					
					answer += "s";
					
					break;
				
				case 10:
					
					answer += "d";
					
					break;
				
				case -10:
					
					answer += "a";
					
					break;
	
				default:
					break;
			}
			
		}
		
		System.out.println(answer);
		
	}
	
	
}
