package Project;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rst=" ";
		for (int i=ch.length-1;i>=0 ;i-- )
		{
		int k=i;
		while (i>=0&&ch [i]!=' ')
		{
		i--;
		}
		int j=i+1;
		while ( j<=k)
		{
		rst =rst +ch[j];
		j++;
		}
		rst=rst+' ';
		}
		System.out.println("The reserve sentence is:"+rst);
		

	}

}
