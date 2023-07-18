package ProjectAssignment;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ThursdayJavaPractice {

	@Test
	public void ReverseTheWord() 
	{
		String s="My name is siva";
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) 
		{
			for (int j = st[i].length()-1; j >=0; j--) 
			{
				System.out.print(st[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	@Test
	public void countNumberOfVowelsInStringArrayRemovingDuplicate()
	{
	
	String s[]= {"apple","orange","greenapple","pinapple"};
	
	for (int i = 0; i < s.length; i++) 
	{
		char[] ch = s[i].toCharArray() ;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count=0;
		for (int j = 0; j < ch.length; j++)
		{
		   set.add(ch[j]);	
		}
		for( Character it:set)
		{
			if(it=='a'||it=='i'||it=='o'||it=='e'||it=='u') 
			{
			count++;	
			}
		}
		System.out.println(s[i]+" the is "+count);
	}	
	}
	
	@Test
	public void PrintDuplicate() {
		String s="java selenium java selenium python";
		String[] st = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < st.length; i++) 
		{
		  	set.add(st[i]);
		}
		for(String it:set) {
			int count=0;
			for (int i = 0; i < st.length; i++)
			{
			if(it.equals(st[i])) {
				count++;
			}
			}
			
			if(count>1) {
				System.out.println(it);
			}
		}
		
	}
	
	@Test
	public void ReverseTheString() {
		String s="siva";
		for (int i =s.length()-1; i >=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	
	@Test
	public void UpperCase() {
		String s="i aM SIvaSubraManiam";
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++)
		{
			String word = st[i];
			System.out.print(word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase()+" ");
		}
	}
	
	@Test
	public void PalindromeOrNot()
	{   int temp=124;
		int n = temp;
		int rev = 0;
		while(n!=0) {
		 rev=rev*10+(n%10);
		 n=n/10;
		}
		
		if(temp==rev)
		{
			System.out.println(temp+" ==> The given number is palindrome ");
		}
		else
			
			System.out.println(temp+" ==> The given number is not palindrome ");
	}
	
	@Test
	public void swapTheString()
	{
	   String s = "Hi buddy";
	   String[] st = s.split(" ");
	   for (int i = st.length-1; i >=0 ; i--)
	   {
		System.out.print(st[i]+" ");
	}
	}
	@Test
	public void SwapNumber()
	{
		int n1=147;
		int n2=145;
		System.out.println(n1+" "+n2);
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+" "+n2);
	}
	
	@Test
	public void SwapNumberWithouThirdVariable()
	{
		int n1=147;
		int n2=145;
		System.out.println(n1+" "+n2);
	    n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println(n1+" "+n2);
	}
	
	@Test
	public void SwapString1()
	{
		String s="who are you";
		String[] st = s.split(" ");
		
		int key = 1;
		for (int i = 0; i < key; i++) 
		{
			String temp = st[0];
		    for (int j = 1; j < st.length; j++)
		    {
				st[j-1]=st[j];
			}	
		    st[st.length-1]=temp;
		}
		
		for(String a:st)
		{
			System.out.print(a+" ");
		}
	}
	
	@Test
	public void SumOfNumberInString()
	{
		String s="a1b2c34";
		String str = "";
		for (int i = 0; i < s.length()-1; i++) 
		{
		 if(s.charAt(i)>=0 && s.charAt(i)>=9)
         {
			 str=str+s.charAt(i);
		 }
		}
	    int n = Integer.parseInt(str);
	    int sum=0;
	    while(n!=0)
	    {
	    	sum=sum+(n%10);
	    	n=n/10;
	    }
	    System.out.println(sum);
	}
	
	
	
}
