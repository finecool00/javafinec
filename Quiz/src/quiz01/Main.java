package quiz01;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		//int[] num_list = {3, 4, 5, 2, 1};
		int[] num_list = {5, 7, 8, 3};
		
		int result1 = 1;
		for(int i = 0; i < num_list.length; i++) {
			result1 *= num_list[i];
		}
		int result2 = 0;
		for(int i = 0; i < num_list.length; i++) {
			result2 += num_list[i];
		}
		
		int answer = 0;
		if(result1 > result2 * result2) {
			answer = 0;
		} else if(result1 < result2 * result2) {
			answer = 1;
		}
		
		System.out.println(answer);
		
		
		
	}	
}