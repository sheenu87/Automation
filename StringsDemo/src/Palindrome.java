import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the  String"); //eye
	    String s1=sc.nextLine();
	    
	  //  boolean b=checkString(s1);
	//    if(b)
	  //  	System.out.println("String is a palindrome");
	    //else
	    	//System.out.println("String is not a palindrome");
					
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			s=s1.charAt(i)+s;
		}
		if(s.equalsIgnoreCase(s1))
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");	
	
	
}
}
	


