package level1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class quiz01 {

	public static void main(String[] args) {
		
		//문제 이름 : 달리기 경주
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		
		Map<Integer, String> runner = new TreeMap<Integer, String>();
		Map<String, Integer> rank = new HashMap<>();
//		Set<Integer> set = runner.keySet();
		//List<E>
		
		for(int i = 0; i < players.length; i++) {
			runner.put(i + 1, players[i]);
			rank.put(players[i], i + 1);
		}
		
		System.out.println(runner.toString());
		System.out.println(rank.toString());
		
		//int a = 0;
		for(int i = 0; i < callings.length; i++) {
			
			String win = callings[i]; //추월한 사람
			int a = rank.get(win); //추월한 사람의 원래 등수
			
			String lose = runner.get(a - 1); //추월당한 사람
			int b = rank.get(lose); //추월당한 사람 원래 등수
			
			//runner 갱신
			runner.put(b, win); //추월한 사람 변경 후
			runner.put(a, lose); //추월당한 사람 변경 후
			
			//rank 갱신
			rank.put(win, b); //추월한 사람 변경 후
			rank.put(lose, a); //추월당한 사람 변경 후
			
		}
		
		String[] answer = runner.values().toArray(new String[players.length]);
			
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<String> list = new ArrayList<>();
//		
//		//list에 값 넣기
//		for(int i = 0; i < players.length; i++) {
//			list.add(players[i]);
//		}
//		
//		//callings 요소와 일치하는 list 인덱스값 찾기
//		for(int i = 0; i < callings.length; i++) {
//			
//			for(int j = 0; j < list.size(); j++) {
//			
//				if(callings[i].equals(list.get(j))) {
//					Collections.swap(list, j, j-1);
//					break;
//				}
//			}
//		}
//		
//		String[] answer = list.toArray(new String[list.size()]);
//		System.out.println(Arrays.toString(answer));
		
	}
}
