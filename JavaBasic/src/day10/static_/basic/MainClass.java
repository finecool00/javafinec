package day10.static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
//		String[] arr = {"아", "에", "이", "오", "우"};
//		System.out.println(MyArrays.printArray(arr));
		
//		int[] arr2 = {1, 2, 3, 4, 5};
//		System.out.println(MyArrays.printArray(arr2));
		
//		char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
//		System.out.println(MyArrays.printArray(arr3));
		
		System.out.println(MyArrays.printArray(new String[4]));
		System.out.println(MyArrays.printArray(new char[3]));
		System.out.println(MyArrays.printArray(new int[5]));
		
		//클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println(init.price);
		System.out.println(init.price);
		System.out.println(init.price);
		System.out.println(init.price);
		System.out.println(init.price);
		System.out.println(init.price);
		System.out.println(init.price);
		
		
		
		
	}
	
}
