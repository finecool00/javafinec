package quiz15;

public class MainClass {

	
	public static void main(String[] args) {
		
		IBag abag = new MyBag();
		abag.insert("초콜렛");
		abag.insert("젤리");
		abag.insert("사탕");
		abag.insert("초콜렛");
		abag.insert("젤리");
		abag.insert("사탕");
		abag.print();
		System.out.println("인덱스 위치 : " + abag.search("사탕"));
		System.out.println("삭제? : " + abag.delete("초콜렛"));
		abag.print();
		
		
		
		
		

	}
	
}
