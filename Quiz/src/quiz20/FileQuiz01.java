package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 파일명을 입력받습니다.
		 * 2. 입력받은 파일을 filecopy폴더로 복사해서 옮겨주면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String fileName = scan.next();
		
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + fileName;
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\" + fileName;
		
		try(InputStream is = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath)) {
			
			byte[] arr = new byte[2048];
			
			int result;
			while((result = is.read(arr)) != -1) {
				out.write(arr, 0, result);
			}	
			
			System.out.println("파일복사 완료");
			
		} catch(Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}
	
}
