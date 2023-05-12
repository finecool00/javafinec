package quiz18;

public class StringQuiz02 {
	/* 주민번호 검증메서드 masking(String)
	 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
	 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
	 * 
	 * 조건
	 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
	 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
	 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
	 * 4. 남, 여에 대한 정보를 출력해줍니다.
	 *  
	 * masking메서드를 만들어주세요 
	 * 검증데이터 950101-1000000 -> 남자
	 * 검증데이터 9501012000000 -> 여자
	 * 검증데이터 950101-5000000 -> 예외
	 * 검증데이터 9501015000000 -> 예외
	 * 검증데이터 950101511111 -> 예외
	 */
//	public static String result = "";
//	
//	StringQuiz02(String str) {
//		
//	}
//	
//	public static String masking(String str) throws Exception {
//		if(str.length() == 13) {
//			if(str.charAt(6) == 1) {
//				result = str.substring(0, 6) + "-*******";
//				System.out.println(result);
//			} else if(str.charAt(6) == 2) {
//				result = str.substring(0, 6) + "-*******";
//				System.out.println(result);
//			} else {
//				System.out.println("예외");
//			}
//			
//		} else {
//			if(str.contains("-")) {
//				if(str.charAt(7) == 1) {
//					result = str.substring(0, 7) + "-*******";
//					System.out.println(str);
//				} else if(str.charAt(7) == 2) {
//					result = str.substring(0, 7) + "-*******";
//					System.out.println(str);
//				} else {
//					System.out.println("예외");
//				}
//			}
//		}
//		
//		
//		
//		return result;   
		
	public static void main(String[] args) {
		try {
			System.out.println(masking("123456-6234567"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		//특수문자가 포함된 경우, 특수문자를 없애고 조건을 세우면 편하다
	public static String masking(String ssn) throws Exception {
		
		ssn = ssn.replace("-", "");
		
		if(ssn.length() == 13) { //길이가 13
			//95010120000000 -> 2
			
			switch (ssn.charAt(6)) {
			case '1' :
			case '3' :	
				System.out.println("남자");
				break;
			case '2' :
			case '4' :
				System.out.println("여자");
				break;
			default:
				System.out.println("잘못 입력했습니다");
				throw new Exception();
			}
				
		} else {
			System.out.println("주민번호는 숫자 13자리 입니다");
			throw new Exception();
		}
		
		return ssn.substring(0, 6) + "-" + "*".repeat(7);
	}
	
}
