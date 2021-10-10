package logicalProgram;

import java.util.Scanner;

public class String1 {
	
public static void main(String[] args) {
	
	System.out.println("enter name");
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	char a[] = s.toCharArray();
	System.out.println(a.length);
	for(int i=a.length-1 ; i>=0; i--)
	{
		for(int j=0; j<=i ;j++)
		{
			System.out.print(a[j]);
		}
		System.out.println();
	}
	for(int i=1;i<=a.length-1;i++)
	{
		for(int j=0; j<=i; j++)
		{
			System.out.print(a[j]);
		}
		System.out.println();
	}
	

}
}