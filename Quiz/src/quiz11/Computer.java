package quiz11;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	private KeyBoard keyBoard;
	private Monitor monitor;
	private Mouse mouse;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	
	public Computer() {
		this.keyBoard = new KeyBoard();
		this.monitor = new Monitor();
		this.mouse = new Mouse();
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.

	public Computer(KeyBoard keyBoard, Monitor monitor, Mouse mouse) {
		this.keyBoard = keyBoard;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	public void computerInfo() {
		//각 클래스의 내용이 Computer클래스에 변수로 선언 및 초기화 되어있으므로 아래와 같이 사용 가능
		System.out.println("=====컴퓨터 정보=====");
		keyBoard.info();
		monitor.info();
		mouse.info();
		System.out.println("==================");
		
	}
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	
	public void setKeyBoard() {
		this.keyBoard = keyBoard;
	}
	
	public KeyBoard getKeyBoard() {
		return keyBoard;
	}
	
	public void setMonitor() {
		this.monitor = monitor;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	
	public void setMouse() {
		this.mouse = mouse;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
