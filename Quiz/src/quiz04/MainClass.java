package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Wizard wiz = new Wizard("코크홀릭");
		wiz.info();
		wiz.iceArrow();
		
		System.out.println("===============================");
		
		Warrior war = new Warrior("킹오브워리어");
		war.info();
		war.bash();
	}
	
}
