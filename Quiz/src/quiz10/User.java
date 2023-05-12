package quiz10;

public class User { //값을 저장하기 위한 단순한 클래스

	private String name;
	private int rrn;
	private int age;
	
	//생성자
	public User() {}
	
	public User(String name, int rrn, int age) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	
	//getter / setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	public int getRrn() {
		return rrn;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
}
