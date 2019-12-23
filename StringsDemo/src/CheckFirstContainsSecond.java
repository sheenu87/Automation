import java.util.Scanner;

public class CheckFirstContainsSecond {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first String"); //Heman
    String s1=sc.nextLine();
    System.out.println("Enter the second String"); //man
    String s2=sc.nextLine();
    boolean b=checkString(s1,s2);
    if(b)
    	System.out.println("String 2 is present in String 1");
    else
    	System.out.println("String 2 is not present in String 1");
	}

static boolean checkString(String st, String st1)
{
	boolean result=false;
   if(st.length()>=st1.length())
   {
	    result=st.contains(st1);
	   
   }
   else
   {
	   System.out.println("String 1 is smaller than String 2");
	   return false;
   }
   return result;	
}
}