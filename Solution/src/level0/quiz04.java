package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz04 {

	public static void main(String[] args) {
		
		//카운트 다운
		
		int start = 10;
		int end = 3;
		
		List<Integer> list = new ArrayList<>();
		
		int i = start;
		while(i >= end) {
			
			list.add(i);

			i--;
			
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
