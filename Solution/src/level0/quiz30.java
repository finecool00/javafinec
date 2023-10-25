package level0;

public class quiz30 {

	public static void main(String[] args) {
		
		
		//문제 : 특별한 이차원 배열2(lv0)
		
		/*
		 * 문제설명
		 * n * n크기의 이차원 배열 arr에서 아래 조건이 만족하면 1 반환, 불만족하면 0 반환
		 * 조건 : 0 <= i, j < n인 정수 i, j에 대해 arr[i][j] == arr[j][i] 
		 */
		
		
		
		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
//		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
		
		int answer = 1; //초기화 값을 1로 지정(만족시 값)
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				//조건 불만족 나오는 즉시 0 반환
				if(arr[i][j] != arr[j][i]) {
					
					answer = 0;
					System.out.println(answer);
					break;
				}
				
			}
			
		}
		
		System.out.println(answer);
		
	}
	
	
}
