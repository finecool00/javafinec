package day03;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
		/*		
		int a = 0;
		while(a < arr.length) {
			
			System.out.println("배열의 " + a + "번째 인덱스 : " + arr[a]);
			
			a++;
		}
		*/
		
		//배열값들의 합
		int a = 0;
		int sum = 0;
		
		while(a < arr.length) {
			
			sum += arr[a];
			
			a++;
		}
		System.out.println("배열요소의 합 : " + sum);
	}
	
}
