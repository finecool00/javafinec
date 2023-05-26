package level0;

import java.util.Arrays;

public class quiz05 {

	public static void main(String[] args) {
		
		//직사각형 넓이 구하기
		
		//int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
		int[][] dots = {{-1,-1},{1,1},{1,-1},{-1,1}};
		
		
		System.out.println(Arrays.toString(dots[0]));
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < dots.length; i++) {
			
//			for(int j = 0; i < dots[i].length; j++) {
				
				if(dots[0][0] == dots[i][0]) {
					a = Math.abs(dots[0][1] - dots[i][1]);
				}
				if(dots[0][1] == dots[i][1]) {
					b = Math.abs(dots[0][0] - dots[i][0]);
				}
				
//			}
			
		}
		System.out.println(a * b);
	}
	
	
}
