package level0;

public class quiz03 {

	public static void main(String[] args) {
		
		//문제이름 : 치킨 쿠폰
		
		int chicken = 100;
		//int chicken = 1081;
		int coupon = 0;
		int answer = 0;
		
		while(chicken >= 10) {
			
			answer += chicken / 10;
			chicken = chicken / 10 + chicken % 10;
			
		}
		
		System.out.println(answer);
	}
	
}
