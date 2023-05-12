package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Radio r = new Radio(); //300, 뤠디오
		Computer c = new Computer();
		Tv t = new Tv();
		
		
		MyCart cart = new MyCart(2000);
		
		cart.buy(t);
		cart.buy(t);
		cart.buy(t);
		cart.buy(c);
		cart.buy(r);
		cart.buy(r);
		
		cart.info();
		
		
		
		
		
	}
	
}
