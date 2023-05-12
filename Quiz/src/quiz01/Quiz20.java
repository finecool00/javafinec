package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		//백준 - 1차원배열 - 10818번
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a]; //크기가 a인 배열
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		//최소, 최대 결정
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		while(i < arr.length); {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		System.out.println(min + " " + max);
	}
}

//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int[] arr = new int[n];
//		
//		int max = 0;
//		int min = 0;
//		
//		for(int i = 0; i < n; i++) {
//			int a = scan.nextInt();
//			arr[i] = a;
//
//			max = arr[0];
//			min = arr[0];
//			
//			if(max < arr[i]) {
//				max = arr[i];
//			} 
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min + " " + max);