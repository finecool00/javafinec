package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("wooki19", "password125", 100000);
		
		ac.deposit(-5000); //입금
		ac.withDraw(110000); //출금
		
		//int num = scan.nextInt();랑 뭐가 다를까~ 없다!
		int balance = ac.getBalance(); //잔고확인
		System.out.println("통장 잔고는 : " + balance + "원 입니다");
		
		
	}
	
}
