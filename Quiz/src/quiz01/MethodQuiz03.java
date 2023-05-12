package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd','e'};
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
		
		 String re1 = method6(arr);
		 System.out.println(re1);
		 
		 int re2 = method7(arr2);
		 System.out.println(re2);
		 
		 String[] re3 = method8("가", "나");
		 System.out.println(Arrays.toString(re3));
	}
	
	static String method6(char[] arr) {
		String s = "";
		
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}	
		return s;
	}
	
	static int method7(int[] arr2) {
		int sum = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		
		return sum;
	}
	
	static String[] method8(String a, String b) {
		
		String[] arr3 = new String[2];
		
		arr3[0] = a;
		arr3[1] = b;
		
		return arr3;
	}
	
}
