package co.suman;

import java.util.LinkedList;
import java.util.List;

public class LinkedListp {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Suman");
		list.add("Paul");
		list.add("Agatala");
		System.out.println(list);
		System.out.println("Adding at specific index");
		list.add(2,"Amtali");
		System.out.println(list);
		System.out.println("Updating entries");
		list.set(2, "R.K Palli- Amtali");
		System.out.println(list);
		System.out.println("Removing from specific index");
		list.remove(3);
		System.out.println(list);
		
	}

}
