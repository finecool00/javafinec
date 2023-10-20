package level1;

public class quiz03 {

	
	public static void main(String[] args) {
		
		//문제 : 약수의 합
		
		/*
		 * 주어진 정수 n(범위 : 0 <= n <= 3000)의 약수를 모두 더한 값 리턴
		 */
		
		int n = 12;
//		int n = 5;
		
		//정수 n 자기자신을 미리 넣어놓음
		int answer = n;
		
		//모든 약수 합 구하기
		//약수는 1부터 자기자신의 절반까지만 판단하여 더하고, 마지막에 자기자신까지 더하면 됨
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
