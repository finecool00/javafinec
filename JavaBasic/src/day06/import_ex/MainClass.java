package day06.import_ex;

//import day06.fruit.Apple; //패키지명을 포함한 클래스명
//import day06.fruit.Melon;
import day06.fruit.*;

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon mel = new Melon();
		
		System.out.println();
		
		int[] arr = new int[5];
		System.out.println(arr);
		
		String str = new String("야");
		
		System.out.println(str);
	}
	
}
