package day12.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
	
		//반복문에서의 예외처리
		//(이런 경우의 처리에 대해 좀 많이 생각해봐야함)
		
		String[] arr = {"홍길동", "이순신", "홍길자"};
		
		int i = 0;
		while(i < 4) {
			
			try {
				System.out.println(arr[i]);	
			} catch (Exception e) {
				System.out.println("배열의 범위를 벗어남");
			} finally { //try에서 잘 실행된 경우에도 반드시 실행됨
				System.out.println("이 문장은 무조건 실행되는 문장입니다");
			}
			
			i++;
		}
		System.out.println("프로그램 정상종료");
	}
			
}
