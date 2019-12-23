
//Need to correct this

import java.util.Arrays;
import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String"); //"Hi Bye"
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{			
			if(ch[i]==' ')
			{	
				ch[i]=ch[i++];
			}			
		}
		System.out.println("The String after removing space is: "+Arrays.toString(ch));
	}

}
