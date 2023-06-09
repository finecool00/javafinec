package quiz21;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

	public static void main(String[] args) {
		
		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 X 4800개
		/* 만약에 연계데이터(다른회사에서 매 일정시에 전송되는 데이터)에서 쓸수 있다.
		 * 
		 * 1.버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2.split(",", 5)를 사용해서 Data객체에 한줄 단위로 저장하고
		 * 3.List<Data>에 하나씩 추가를 합니다.
		 * 4.람다식을 이용해서 지역 : 서울, 4분기중 9~12월, 분양가격 : 2000이상)인 데이터
		 * 새로운 리스트로 반환
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		
		List<Data> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
			
			br.readLine(); //(제목행)한번 넘어감
			String str;
			while((str = br.readLine()) != null) {
				String[] arr = str.split(",", 5); //중간에 없는 데이터가 있을 수 있기 때문에 배열 크기를 지정해 준 것
				
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("\"", "").replace("-", "");
				
				price = price.equals("") ? "0" : price; //공백이라면 "0" 대입, 아니라면 그대로
				
				//System.out.println(price);
				
				Data data = new Data(region, size, year, month, price);
				list.add(data); //리스트에 추가
				
				
//				Data data = new Data();
//				data.setRegion(arr[0]);
//				data.setSize(arr[1]);
//				data.setYear(arr[2]);
//				data.setMonth(arr[3]);
//				data.setPrice(arr[4]);				
//				list.add(data);	
			}
			
			List<Data> result = list.stream().filter( a -> a.getRegion().equals("서울") && Integer.parseInt(a.getMonth()) >= 9 && Integer.parseInt(a.getPrice()) >= 2000).collect(Collectors.toList());
			System.out.println(result);
			System.out.println(result.size());
			
		} catch (Exception e) {
				e.printStackTrace();	
		}
		
		
		
	}
	
}
