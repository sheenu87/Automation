import java.util.Scanner;

public class ReverseString {
	int a;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the  String"); //eye
	    String s1=sc.nextLine();
	    String sf="";
	    for(int i=0;i<s1.length();i++)
	    {
	    	sf=s1.charAt(i)+sf;
	    	
	    }
	    System.out.println("Reverse String: "+sf);
	  }

}
