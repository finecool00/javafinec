package quiz01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {

//		int[] nums = {1, 2, 3, 4};
//		int[] arr = new int[3];
//		
//		
//		Random random = new Random();
//				
//		for(int i = 0; i < arr.length; i++) {
//			
//			arr[i] = nums[random.nextInt(nums.length)];
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//				}
//			}
//		}
//		
//		int answer = 0;
//		int num = 0;
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			num += arr[i];
//		}
//		
//		for(int i = 2; i < num; i++) {
//			if(num % i == 0) {
//				break;
//			} else {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		
		String[] arr1 = quiz[0].split("  ");
		System.out.println(Arrays.toString(arr1));
		String[] newArr = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {

			String[] arr = quiz[i].split(" ");
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[2].equals("+")) {
					int sum = Integer.parseInt(arr[j]) + Integer.parseInt(arr[j+1]);
					if(sum == Integer.parseInt(arr[5])) {
						newArr[j] = "O";
						
					} else {
						newArr[j] = "X";
					}
				} else {
					int mi = Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+1]);
					if(mi == Integer.parseInt(arr[5])) {
						newArr[j] = "O";
					} else {
						newArr[j] = "X";
					}
				}
			}
			System.out.println(Arrays.toString(newArr));
		}
		
		
	}
}