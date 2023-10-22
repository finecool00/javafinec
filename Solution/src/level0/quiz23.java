package level0;

import java.util.Arrays;

public class quiz23 {

	public static void main(String[] args) {
		
		//문제 : 5명씩(lv0)
		
		/*
		 * 문제설명
		 * 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names
		 * 앞에서부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 반환
		 * (마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름 포함
		 * => 4명일 경우에도 1번째 사람 포함, 6명일 경우 1그룹 5명 2그룹 1명으로 2명 반환)
		 */
		
		
		
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		int j = 0;
		
		//1~5명까지 그룹 내 맨 앞사람 1명, 6~10명까지 각 그룹 내 맨 앞사람 2명
		//=> 5로 나눈 나머지가 0(5의 배수)일 경우 5로 나눈 몫 만큼 배열을 만들고,
		//   5로 나눈 나머지가 0이 아닐 경우 5로 나눈 몫 + 1 만큼 배열 만든다.
		
		if(names.length % 5 != 0) {
			
			String[] answer = new String[names.length / 5 + 1];
			
			//5명씩 건너뛰며 answer배열에 추가
			//지역변수 j를 만들어 answer배열에 차례로 값 들어가게 만든다.
			for(int i = 0; i < names.length; i+=5) {
				
				if(i > names.length) {
					break;
				}
				
				answer[j] = names[i];
				j++;
			}
			
			System.out.println(Arrays.toString(answer));
			
		} else {
			
			String[] answer = new String[names.length / 5];
			
			for(int i = 0; i < names.length; i+=5) {
				
				if(i > names.length) {
					break;
				}
				
				answer[j] = names[i];
				j++;
			}
			
			System.out.println(Arrays.toString(answer));
		}
		
		
	}
	
	
}
