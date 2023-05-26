package level0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class quiz01 {

	public static void main(String[] args) {
		
		//문제명 : 정수 내림차순으로 배치하기
		
		long n = 118372;
		long answer = 0;
		
		String n2 = Long.toString(n);
		
		String[] arr = n2.split("");
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String number = "";
		for(int i = 0; i < arr.length; i++) {
			
			number += arr[i];
		}
		int num = Integer.parseInt(number);
		
		StringBuilder sb = new StringBuilder(number);
		answer = Long.parseLong(sb.reverse().toString());
		
		System.out.println(answer);
	}	
}
