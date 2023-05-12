package day10.static_.basic;

public class MyArrays {

	/*
	 * Arrays클래스의 toString메서드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자 붙입니다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도록
	 * 	  메서드 오버로딩 (String) (int) (char)
	 */
	
	private MyArrays() {}
	
	
	public static String printArray(String[] arr) {
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				str += arr[i];
			} else {
				str += arr[i] + ", ";
			}
			
		}
		return "[" + str + "]";
	}
	
	public static String printArray(int[] arr2) {
		String str = "";
		
		for(int i = 0; i < arr2.length; i++) {
			if(i == arr2.length - 1) {
				str += arr2[i];
			} else {
				str += arr2[i] + ", ";
			}
			
		}
		return "[" + str + "]";		
	}
	public static String printArray(char[] arr3) {
		String str = "";
		
		for(int i = 0; i < arr3.length; i++) {
			if(i == arr3.length - 1) {
				str += arr3[i];
			} else {
				str += arr3[i] + ", ";
			}
			
		}
		return "[" + str + "]";
	}
	
	
}
