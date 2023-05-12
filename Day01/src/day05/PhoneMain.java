package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone();
		
		black.info();
		
		Phone pink = new Phone("아이폰14");
		pink.info();
		
		Phone red = new Phone("TTL", "빨간색");
		red.info();
		
		Phone white = new Phone("가로본능", 4000);
		white.info();
		
		
		// model, color, price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요
		// 객체생성도 해보세요
		Phone purple = new Phone("Cyon", "보라색", 50000);
		purple.info();
		
		
		
		
	}
	
}
