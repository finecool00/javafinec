package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ss = new SuperSonicAp("ABS080");
		
		ss.takeOff();
		ss.fly();
		ss.flyMode = 1;
		ss.fly(); //override된 메서드
		ss.land();
		System.out.println(ss.info());
	}
	
}
