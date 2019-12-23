import java.util.Scanner;

//WAP to fetch last 3 characters of array
public class FetchFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the characters in an array");
		char[] ar=sc.nextLine().toCharArray(); // a,b,c,d,e,f
	//	char ar[]=new char[]{'a','b','c','d','e','f'};
		System.out.println("Elements in array are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	//fetch only last 3 characters of array
		System.out.println("Last 3 Elements");
		int t=ar.length-1; //l=7, 7-1=6
		for(int i=t;i>t-3;i--)   //i=7;
		{
			System.out.println("The Last three characters of array are: "+ar[i]);
		}
		
		
	}

}
