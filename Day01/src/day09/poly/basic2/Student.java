package day09.poly.basic2;

public class Student extends Person {

	String studentId;
	
	Student() {}
	
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		//super. ~~ 으로 부모클래스의 기능을 사용할 수 있다.
		return super.info() + ", 학번 : " + studentId;
	}

}
	

