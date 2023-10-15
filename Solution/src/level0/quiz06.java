package level0;

public class quiz06 {

	
	public static void main(String[] args) {
		
		//문제 : 주사위게임2(lv0)
		
//		int a = 2;
//		int b = 6;
//		int c = 1;

//		int a = 5;
//		int b = 3;
//		int c = 3;
		
		int a = 4;
		int b = 4;
		int c = 4;
		
		
		int answer = 0;
		
		if(a != b && a != c && b != c) { 
			answer = a + b + c;
		} else if((a == b && a != c) || (a == c && a != b) || (a != b && b == c) ) {
			answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		} else {
			answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
		}

		
		System.out.println(answer);
		
	}
	
	
}
