package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
			cal.input();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
}
