package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount ma = new MyAccount("Wooki19", "password1234", 100000);
		
		ma.deposit(50000);
		ma.withDraw(30000);
		System.out.println(ma.getBalance());
	}
	
}
