package day02;

public class BreakEx03 {

	public static void main(String[] args) {
		
		//변수를 사용하는 방법
		/*
		boolean flag = false; //탈출을 위한 변수
		
		
		for(char c = 'A'; c <= 'Z' ; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if(l == 'f') {
					flag = true; //탈출을 위해 true
					break;
				}
			} //안쪽 for문 end
			
			if(flag) break;
			
		} //빠깥쪽 for문 end
		*/
		
		//label 방식
		x:for(char c = 'A'; c <= 'Z' ; c++) { //"x :" 으로 이름 붙임
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				if(l == 'f') {
					break x; //break + "반복문 이름"
				}

			} //안쪽 for문 end	
			
		} //바깥쪽 for문 end
		
	}
	
}
