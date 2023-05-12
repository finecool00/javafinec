package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape re = new Rect("사각", 4);
		System.out.println(re.getArea());
		System.out.println(re.getName());
		
		Shape cir = new Circle("원", 2);
		System.out.println(cir.getArea());
		System.out.println(cir.getName());
		
		
		
	}
	
}
