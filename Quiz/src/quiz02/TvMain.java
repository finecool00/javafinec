package quiz02;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();

		tv.power();
		
		int ch = tv.changeChannel(18);
		System.out.println("현재 채널은 " + ch + "번 입니다");
		
		tv.power();
		
		
		
	}
	
}
