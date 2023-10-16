package level0;

public class quiz08 {

	
	public static void main(String[] args) {
		
		//문제 : 제곱수 판별하기(lv0)
		
		/*
		 * 문제설명
		 * 주어진 수 n이 제곱수인지 아닌지 판단하는 문제
		 * 판단방법 : 소수를 활용 => 1과 자신을 제외한 수 중 자신에서 나눴을 때 나누어 떨어지는 수의 개수를 구함
		 * => 개수가 홀수일 경우 제곱수로 판단할 수 있음
		 */
		
		
//		int n = 144;
		int n = 976;
		
		int answer = 0;
		int count = 0;
		
		for(int i = 2; i <= n / 2; i++) {
			
			if(n % i == 0) {
				count++;
			}
			
		}
		
		if(count % 2 == 1) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
		
	}
	
}
