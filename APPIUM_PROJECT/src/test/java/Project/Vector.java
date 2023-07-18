package Project;

import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) {
		//creating an empty vector with intial capacity
		java.util.Vector<String> vec = new java.util.Vector<String>(4);
		//adding element to a vector
		vec.add("Tiger");
		vec.add("lion");
		vec.add("Dog");
		vec.add("Elephant");
		
		
		//check the size and the capacity
		System.out.println("Size is :"+vec.size());
		System.out.println("Capacity is :"+vec.capacity());
		
		//display vector element
		System.out.println("vector element is"+vec);
		vec.addElement("rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		
		//Again check size and capacity
		System.out.println("Size is :"+vec.size());
		System.out.println("Capacity is :"+vec.capacity());
		
		//Display vector Element
		System.out.println("vector element is"+vec);
		
		//checking if tiger is present or not in this vector
		if(vec.contains("Tiger"))
		{
			System.out.println("Tiger is present at the index"+vec.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not present in the list");
		}
		//get the first element
		System.out.println("The first animal of the vector is = "+vec.firstElement());
		//get the last element
		System.out.println("The last animal of the vector is = "+vec.lastElement());
		
		java.util.Vector<Object> v = new java.util.Vector<Object>(4);
		//adding element to a vector
		v.add(20);
		v.add(5);
		v.add(7);
		v.add(1);
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
