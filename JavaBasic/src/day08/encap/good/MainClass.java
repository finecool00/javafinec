package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.day = 2022;
		me.setYear(2022);
		me.setMonth(3);
		me.setDay(30);
		me.setSsn("900801-1234567");
		
		int year = me.getYear();
		System.out.println(year);
		
		int month = me.getMonth();
		System.out.println(month);
		
		int day = me.getDay();
		System.out.println(day);
		
		String ssn = me.getSsn();
		System.out.println(ssn);
		
	}
	
}
