import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumInAsc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers in an array");
		int[] ar=new int[10];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(ar);
		System.out.println("Array after sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
