package Project;

import java.util.ArrayList;

public class ArrayForLoop {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(10);
	    for( Integer i:list)
	    {
	    	System.out.println(i);
	    }
	}

}
