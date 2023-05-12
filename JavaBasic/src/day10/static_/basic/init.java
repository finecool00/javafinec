package day10.static_.basic;

public class init {

	public static int price;
	
	static {
		System.out.println("단 한번 실행됨");
		price = 1000;
		
	}
	
}
