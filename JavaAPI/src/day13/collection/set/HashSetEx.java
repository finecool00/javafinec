package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * 리스트와 반대(순서X, 중복X)
		 * => 인덱스 기준으로 조회하는 메서드가 없습니다.
		 * => 동일한 값 저장하면 들어가지 않습니다.(값 중복XX)
		 * set계열 순회할 때는 향상된 for문, 반복자 개념 사용해야합니다.
		 */
		
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); //중복 X
		
		//
		System.out.println(set.toString());
		//크기
		System.out.println(set.size());
		//삭제(값)
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 => 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}
		
		
		System.out.println("-----------------------------");
		
		//set => iterator타입으로 변경
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { //다음이 있다면 true;
			System.out.println(iter.next());
		}
		
	}
	
}
