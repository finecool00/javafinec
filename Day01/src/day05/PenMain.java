package day05;

public class PenMain {

	public static void main(String[] args) {
		
		//펜을 사용하려면 객체로 생성해야 합니다.
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write();
		
		Pen black = new Pen();
		black.ink = "검정";
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		
		red.info();
		black.info();
		
		
		
		
	}
	
}
