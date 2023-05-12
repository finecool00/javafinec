package day13.collection.set;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		
		//set + 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(34);

		System.out.println(set.toString());//오름차순 자동 정렬
		
		for(int a : set) {
			System.out.println(a);
		}
	}
	
}
