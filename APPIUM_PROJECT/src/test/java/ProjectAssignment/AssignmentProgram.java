package ProjectAssignment;

import org.testng.annotations.Test;

public class AssignmentProgram {
	@Test
	public void fibonaiiseries() 
	{
		int n1=0,n2=1,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2 ;i<count;i++)
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}
	
	@Test
	public void sumOfNumber() {
		int n=12345;
		int temp=0;
		while(n!=0)
		{
			 temp=temp+(n%10);
			 n=n/10;
			
		}
		System.out.println(temp);
	}
	
	@Test
	public void checkPalindromeOrNot() {
		int n=121;
		int n1=n;
		int temp=0;
		while(n!=0)
		{
			 temp=temp*10+(n%10);
			 n=n/10;
			
		}
		if(temp==n1)
		System.out.println("The given number is palindrome");
		else
		System.out.println("The given number is not a palindrome because "+n1+" is not equal to "+temp);
	}
	
	@Test
	public void SwapTheTwoNumber() {
		int n1=45,n2=65;
		System.out.print(n1+" "+n2+" ");
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.print(n1+" "+n2);
	}
	
	
	

}
