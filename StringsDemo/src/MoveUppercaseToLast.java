import java.util.Arrays;
import java.util.Scanner;

public class MoveUppercaseToLast {

	public static void main(String[] args) {
	//String s="HelloIndia";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
	char ch[]=s.toCharArray();
	int len=ch.length-1;
	
	for(int i=0;i<ch.length;i++)
	{
		for(int j=len;j>i;j--)
		{
	  if(ch[i]>='A'&&ch[i]<='Z'&&ch[j]>='a'&&ch[j]<='z')
		{
			char temp=ch[j];			
			ch[j]=ch[i];
			ch[i]=temp;			
		}
		}
	}	
	String f=Arrays.toString(ch);
	System.out.println("The String after moving uppercase letters to last is: "+ f);
	}

}
