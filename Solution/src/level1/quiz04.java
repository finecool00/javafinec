package level1;

import java.util.HashSet;
import java.util.Set;

public class quiz04 {

	public static void main(String[] args) {
		
		//문제 : 삼각형의 완성조건(2)(lv1)
		
		/*
		 * 문제설명
		 * 선분 세개로 삼각형을 만드는 조건 : 가장 긴 변의 길이 < 다른 두 변의 길이 합 
		 */
		
		
		int[] sides = {1, 2};
//		int[] sides = {3, 6};
//		int[] sides = {11, 7};
		
		int count = 0; //조건에 만족하는 수를 카운트하기 위한 변수
		
		//sides의 첫번째 요소가 두번째 요소보다 더 클 경우
		if(sides[0] > sides[1]) {
			
			//1부터 탐색
			for(int i = 1; i < sides[0] + sides[1]; i++) {
				
				//i가 sides요소 중 큰 수보다 작거나 같을 때 -> sides요소 중 작은 수와 더한 값으로 조건 확인
				if(i <= sides[0]) {
					if(i + sides[1] > sides[0]) {
						count++;
					}
				} else {
					//i가 sides요소 중 큰 수보다 클 때 -> sides 요소들의 합으로 조건 확인
					if(sides[0] + sides[1] > i) {
						count++;
					}
				}
				
			}
			
		} else { //sides의 두번째 요소가 첫번째 요소보다 크거나 두 요소값이 같을 경우
			
			//1부터 탐색
			for(int j = 1; j < sides[0] + sides[1]; j++) {
				
				//j가 sides요소 중 큰 값보다 작거나 같을 때 -> sides요소 중 작은 수와 더한 값으로 조건 확인
				if(j <= sides[1]) {
					if(j + sides[0] > sides[1]) {
						count++;
					}
				} else {
					//j가 sides요소 중 큰 수보다 클 때 -> sides요소들의 합으로 조건 확인
					if(sides[0] + sides[1] > j) {
						count++;
					}
				}
				
			}
			
		}
		
		System.out.println(count);
	}
	
}
