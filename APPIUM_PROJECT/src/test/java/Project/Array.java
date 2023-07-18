package Project;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<Object> list =new ArrayList<Object>();
		list.add(15);
		list.add(10);
		list.add('A');
		list.add("Hello");
		list.add(10);
		list.add(2, true);
		System.out.println(list);
		ArrayList<Object> li =new ArrayList<Object>();
		li.add('A');
		li.add('B');
		list.addAll(li);
		System.out.println(list);
		System.out.println(li);
	if(li.contains('A')) {
		System.out.println("yes");
	}
	else
		System.out.println("No");
		

	}

}
