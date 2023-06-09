package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileQuiz02 {

	public static void main(String[] args) {
	    /*
	     * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
	     * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	     * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	     *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	     *    
	     * 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력.
	     */		
		
//		//1번
//		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504";
//		
//		File file = new File(path);
//		
//		file.mkdir();
//		
//		//2번
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println(">");
//		String name = scan.next();
//		
//		String filePath = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504\\" + name+".txt";
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
//			
//			bw.write(name);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		//3번
//		
//		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter(filePath))) {
//			
//			boolean bool = true;
//			while(true) {
//				String word = scan.nextLine();
//				bw2.write(word + "\n");
//				
//				if(word.equals("그만")) {
//					System.out.println("입력을 종료합니다");
//					bw2.flush();
//					break;
//				}
//				
//			}	
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//4번
//		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {	
//			String result;
//			while((result = br.readLine()) != null) {
//				System.out.println(result);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//선생님 풀이
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date); //년월일
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String filename = scan.nextLine(); //파일명
		
		String filepath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + "file"; //경로
		String path = filepath + "\\" + filename + ".txt";
		
		File file = new File(filepath);
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("폴더생성완료");
		} else {
			System.out.println("폴더가 이미존재합니다");
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			BufferedReader br = new BufferedReader(new FileReader(path));) {
			//쓰는 작업
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					System.out.println("종료합니다");
					break;
				}
				
				bw.write(str); //입력받은 값을 쓴다
				bw.flush(); //write하고나서 flush하면 실시간으로 값출력 가능!
			}
			
			//읽는 작업
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
