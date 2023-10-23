package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz25 {

	public static void main(String[] args) {
		
		
		//문제 : 할 일 목록(lv0)
		
		/*
		 * 문제설명
		 * todo_list 배열에서 아직 마치지 못한 일(finished 배열이 false인 경우)을 순서대로 담은
		 * 문자열 배열을 반환
		 */
		
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		
		boolean[] finished = {true, false, true, false};
		
		//마치지 못한 일을 담을 리스트
		List<String> list = new ArrayList<>();
		
		//finished가 false인 todo_list를 리스트에 담는다
		for(int i = 0; i < todo_list.length; i++) {
			
			if(finished[i] == false) {
				list.add(todo_list[i]);
			}
			
		}
		
		//끝내지 못한 리스트의 크기만큼의 새로운 배열 만든다
		String[] answer = new String[list.size()];
		
		//리스트의 요소를 새로운 배열에 담는다
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	
}
