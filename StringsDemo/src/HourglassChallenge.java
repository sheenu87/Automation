import java.util.Scanner;

//input: -9 -9 -9  1 1 1  
/*		  0 -9  0  4 3 2  
		 -9 -9 -9  1 2 3
 		  0  0  8  6 6 0
 		  0  0  0 -2 0 0
 		  0  0  1  2 4 0    */

public class HourglassChallenge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[][] arr=new int[6][6];
		System.out.println("Enter the values for matrix");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("The entered matrix is ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int val=hourGlass(arr);
		System.out.println("The highest hourglass value is: "+val);		
	}
	
static int hourGlass(int[][] arr)
	{
		int hVal=0, sum=0;
		
		
		
		
		
		
		return hVal;
	}

}
