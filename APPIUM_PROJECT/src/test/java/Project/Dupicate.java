package Project;

import java.util.ArrayList;

public class Dupicate {

	public static void main(String[] args) {
		ArrayList<Object> list =new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("Hi");
		list.add("Hello");
		System.out.println(list);
		ArrayList<Object> list1 =new ArrayList<Object>();
		list1.add(20);
		list1.add("Hi");
		list1.add("Hello");
		list.add(list1);
	System.out.println(list.get(2));
		//list.retainAll(list1);
		list.remove(list1);
		System.out.println(list);
		System.out.println(list1);

	}

}
