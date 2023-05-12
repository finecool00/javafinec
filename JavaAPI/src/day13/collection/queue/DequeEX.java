package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEX {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		//ArrayDeque<Integer> = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());
		
		//앞에서 꺼내기(getter와 다르게 빠지면 요소가 없어짐)
		int n = que.pollFirst();
		System.out.println("반환된 원소 : " + n);
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("-----------------------------");
		//앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString());
		
		//뒤에서 꺼내기
		que.pollLast();
		System.out.println(que.toString());
		
		//[4,3,2]
		//list의 get처럼 앞에서 or 뒤에서 값을 확인만 하기
		System.out.println(que.peekFirst());
		//큐는 변함이 없음
		System.out.println(que.toString());
		
	}
	
}
