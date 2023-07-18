package Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(10);
		
	    Collections.sort(list);
		System.out.println(list);

	}

}
