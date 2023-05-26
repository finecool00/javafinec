package level1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class quiz02 {

	public static void main(String[] args) {
		
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		//String[] survey = {"TR", "RT", "TR"};
		int[] choices = {5, 3, 2, 7, 5};
		//int[] choices = {7, 1, 3};
		String[] ct = {"R", "T", "C", "F", "J", "M", "A", "N"};
		
		Map<String, Integer> score = new TreeMap<String, Integer>(); //캐릭터별 점수 모음
		String answer = "";
	
		for(int i = 0; i < ct.length; i++) {
			
			score.put(ct[i], 0);
			
		}
		
		String str = "";
		int cur = 0;
		
		for(int i = 0; i < survey.length; i++) {
			
			if(Boolean.parseBoolean(survey[i]) == false) {
				
				switch (choices[i]) {
				case 1:
					
					str = Character.toString(survey[i].charAt(0));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 3);
					
					break;
				case 2:
					
					str = Character.toString(survey[i].charAt(0));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 2);
					
					break;
				case 3:
					
					str = Character.toString(survey[i].charAt(0));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 1);
					
					break;
				case 4:
					
					break;
				case 5:
					
					str = Character.toString(survey[i].charAt(1));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 1);
					
					break;
				case 6:
					
					str = Character.toString(survey[i].charAt(1));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 2);
					
					break;
				case 7:
					
					str = Character.toString(survey[i].charAt(1));
					cur = score.get(str).intValue();
					
					score.put(str, cur + 3);
					
					break;

				default:
					break;
				}
				
			}
				
		}
		
		if(score.get("R") > score.get("T")) {
			
			answer += "R";
		} else if(score.get("R") == score.get("T")) {
			answer += "R";
		} else {
			answer += "T";
		}

		if(score.get("C") > score.get("F")) {
			
			answer += "C";
		} else if(score.get("C") == score.get("F")) {
			answer += "C";
		} else {
			answer += "F";
		}
	
		if(score.get("J") > score.get("M")) {
			
			answer += "J";
		} else if(score.get("J") == score.get("M")) {
			answer += "J";
		} else {
			answer += "M";
		}
		
		if(score.get("A") > score.get("N")) {
			
			answer += "A";
		} else if(score.get("A") == score.get("N")) {
			answer += "A";
		} else {
			answer += "N";
		}
		
		
		
		System.out.println(answer);
		System.out.println(score.toString());
			
		}
		
		
		
	}
	
	

