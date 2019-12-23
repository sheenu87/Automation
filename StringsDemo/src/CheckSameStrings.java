import java.util.Scanner;

//check if two strings are same
public class CheckSameStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first String");  //abc
		String s1=s.nextLine();
		System.out.println("Enter second String");   //def
		String s2=s.nextLine();
		int count=0;
		if(s1.length()!=s2.length())
		 System.out.println("String are not same");
		
		for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					count++;
			}
		if(count==s1.length())
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not same");	
		
	}

}
