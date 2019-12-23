import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();  //245
		sc.close();
		String s="";
		while(n%10!=0)
		{
			s=s+(n%10);  
			n=n/10;
		}
		System.out.println("The reversed number is: "+s);
	}

}
