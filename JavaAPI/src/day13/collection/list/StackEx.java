package day13.collection.list;

import java.util.List;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		/*
		 * Stack
		 * => Last in First Out(후입선출)
		 * => push(), pop()
		 */
		
		Stack<String> stack = new Stack<>();
		
		//값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//형태를 문자열로 확인(모든 컬렉션 공통)
		System.out.println(stack.toString());
		
		String n = stack.pop();
		System.out.println("POP : " + n);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		//에러
		System.out.println(stack.pop());
		
		
	}
	
}
