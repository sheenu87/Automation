import java.util.Scanner;

public class PalindromeRevision {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to check if its palindrome or not");
		String st=s.nextLine();  //madam
		String pal="";
		for(int i=0;i<st.length();i++)
		{
			pal= st.charAt(i)+pal;			
		}
		if(pal.equalsIgnoreCase(st))
			System.out.println("String is a palindrome");
		else
			System.out.println("Not palindrome");
		
	}
}
