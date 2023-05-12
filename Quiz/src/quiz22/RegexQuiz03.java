package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
	
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 한줄씩! 읽어들입니다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 패턴분석
		 *   Product객체에 저장하고, 리스트에 저장
		 * 
		 * 4.외부라이브러리(POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸수 있도록하는 기능
		 * 	 하나의 시트에 각 행데이터를 엑셀 파일로 출력
		 */
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String str;	
			
			while((str = br.readLine()) != null) {
				String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
				String pattern2 = "[가-힣]+\\s[가-힣]+"; //"[가-힣]+ (강남점|평내호평점|...) 식으로도 가능(가짓수가 많지 않다면!)
				String pattern3 = "\\[[A-Z가-힣]+\\]";
				String pattern4 = str.substring(str.indexOf("]")+2, str.lastIndexOf(" ")); // str.substring(m3.end() + 1, m5.start() - 1); 으로도 가능
				String pattern5 = "[0-9,]+원"; // "\\d+,*\\d+원" 으로도 표현 가능
				
				String day = "";
				String store = "";
				String grade = "";
				String detail = "";
				String price = "";
				
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					day = m1.group();
					store = m2.group();
					grade = m3.group();
					detail = pattern4;
					price = m5.group();
				}
				
				//1행을 product 객체에 저장
				Product product = new Product(day, store, grade, detail, price);
				//product를 리스트
				list.add(product);
				
			}//end while
			
			//엑셀쓰기 호출(선생님 풀이)
				createExcel1(list);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		String newPath = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";
//		
//		try(FileOutputStream fos = new FileOutputStream(newPath)) {
//			
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			XSSFSheet sheet = workbook.createSheet("건담");
//			
//			XSSFRow row;
//			
//			for(int i = 0; i < list.size(); i++) {
//				row = sheet.createRow(i);
//				row.createCell(0).setCellValue(list.get(i).getDay());
//				row.createCell(1).setCellValue(list.get(i).getStore());
//				row.createCell(2).setCellValue(list.get(i).getGrade());
//				row.createCell(3).setCellValue(list.get(i).getDetail());
//				row.createCell(4).setCellValue(list.get(i).getPrice());
//			}
//			
//			workbook.write(fos);
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		}
	//선생님 풀이
	public static void createExcel1(List<Product> list) {
		
		//
		XSSFWorkbook workbook = new XSSFWorkbook();
		//시트
		XSSFSheet sheet = workbook.createSheet();
		//시트 내 행
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		//리스트를 엑셀파일로
		for(int i = 0; i < list.size(); i++) {
			
			XSSFRow row = sheet.createRow(i + 1);
			
			Product p = list.get(i); //리스트 안에 객체
			
			row.createCell(0).setCellValue(p.getDay());
			row.createCell(1).setCellValue(p.getStore());
			row.createCell(2).setCellValue(p.getGrade());
			row.createCell(3).setCellValue(p.getDetail());
			row.createCell(4).setCellValue(p.getPrice());
		
		}
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";
		try(FileOutputStream fos = new FileOutputStream(path)) {
			workbook.write(fos);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
