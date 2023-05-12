package quiz08;

public class CartMain {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(1300);
		mc.buy("tv");
		mc.buy("radio");
		mc.buy("com");
		mc.info();
		
		
	}
	
}
