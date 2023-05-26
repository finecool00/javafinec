package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class quiz01 {

	public static void main(String[] args) {
		
		//문제 제목 : 오픈채팅방
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

		String str = record[0].split(" ")[0];
		
		System.out.println(str);

		List<String> list = new ArrayList<>();
		
		Map<String, String> map = new HashMap<>();
		
	
//		Map<String, String> map2 = new HashMap<>();
//		map2.put("Enter", "들어왔습니다.");
//		map2.put("Leave", "나갔습니다.");
//		
//		System.out.println(map.get(record[0].split(" ")[1]));
		
		for(int i = 0; i < record.length; i++) {
			
			if(record[i].split(" ")[0] == "Enter") {
				
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				list.add(record[i].split(" ")[2] + "님이 들어왔습니다.");
				
			} else if(record[i].split(" ")[0] == "Leave") {
				
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				list.add(record[i].split(" ")[2] + "님이 나갔습니다.");
				
			} else if(record[i].split(" ")[0] == "Change") {
				
				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				
			}
			
		}
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
//		int i = 0;
//		while(i < record.length) {
//			
//			map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
//			
//			x : switch (record[i].split(" ")[0]) {
//			case "Enter" :
//				
//				list.add(record[i].split(" ")[2] + "님이 들어왔습니다.");
//				
//				break x;
//			case "Leave" :
//				
//				list.add(record[i].split(" ")[2] + "님이 나갔습니다.");
//				
//				break x;
//			case "Change" :
//				map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
//				
//				break x;
//
//			default:
//				break x;
//			}
//			i++;			
//		}
//		System.out.println(list.toString());
		
	}
	
	
}
