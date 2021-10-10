package logicalProgram;

import java.util.Scanner;

public class StringPattern3 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	String org = scan.nextLine();
	char a[] = org.toCharArray();
	
	for(int i = 0 ; i<a.length; i++)
	{
		for(int j=0; j<=i ; j++)
		{
			System.out.print(a[j]);
		}
		System.out.println();
	}
	
	for(int i = a.length-1; i>= 0; i-- )
	{
		for(int j = i ; j>=0 ; j--)
		{
			System.out.print(a[j]);
		}
		System.out.println();
	}
	

}
}