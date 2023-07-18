package Project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HasSet {

	public static void main(String[] args) {
		 //Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet<String>();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Two");
	           set.add("Five");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	           
	           
	           TreeSet tree = new TreeSet();
	           tree.add(12);
	           tree.add(-23);
	           tree.add(50);
	           tree.add(1);
	           System.out.println(tree);
	           tree.comparator();
	           System.out.println(tree);
	

	}

}
