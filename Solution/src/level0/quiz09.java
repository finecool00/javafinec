package level0;

public class quiz09 {

	
	public static void main(String[] args) {
		
		//문제 : 개미군단(lv0)
		
		/*
		 * 문제설명
		 * 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 함
		 * 장군개미 : 공격력 5, 병정개미 : 공격력 3, 일개미 : 공격력 1
		 * 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지 구하라
		 */
		
//		int hp = 23;
//		int hp = 24;
		int hp = 999;
		
		int answer = 0;
		
		//장군개미 수 구하기
		answer += hp / 5;
		hp = hp % 5;
		
		//병정개미 수 구하기(장군개미 공격력 미만의 체력, 체력이 0이 아닐 때)
		if(hp < 5 && hp != 0) {
			answer += hp / 3;
			hp = hp % 3;
			
			//일개미 수 구하기(병정개미 공력력 미만의 체력, 체력이 0이 아닐 때)
			if(hp < 3 && hp != 0) {
				answer += hp / 1;
				hp = hp % 1;
				
				//체력이 0일 경우 계산을 끝냄
				if(hp == 0) {
					System.out.println("정답은 : " + answer);
				}
			}
			
		} 
		
	}
	
}
