package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel(new Chef());
				
		//Chef를 생성해서 Hotel한테 전달
		Chef c = new Chef();
		//사용하는 곳(생성하는 곳)
		//h.setChef(new Chef());
		
		Chef chef = h.getChef(); //Hotel안에 있는 Chef를 꺼냄, 반환유형을 읽을 줄 알아야 함
		chef.cooking();
		System.out.println(c == chef);
		
	}
	
}
