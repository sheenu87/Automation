import java.util.Scanner;

public class CompareIfSame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String for comparison");
		String s=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the second String for comparison");
		String s2=sc.nextLine();
		
		if(s.length()!=s2.length())
		{
			System.out.println("Both Strings are not same");
		}		
		
		else if(s.equalsIgnoreCase(s2))
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
		}
	}
	}




