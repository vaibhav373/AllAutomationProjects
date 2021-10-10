import java.util.Scanner;

public class Demo_Test3 
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		int first=0,second=0;
		System.out.println("Enter the Elements of tyhe array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
		}
		
		System.out.println("Second Highest is "+second);
	}
}
