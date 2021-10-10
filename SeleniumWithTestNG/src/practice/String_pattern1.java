package practice;

import java.util.Scanner;

public class String_pattern1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char a[] = name.toCharArray();
		for(int i = a.length-1; i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
//		Scanner sc = new Scanner(System.in);
		String name1 = name;
		
		char b[]	= name1.toCharArray();
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print(b[j]);
			}
			System.out.println();
		}
	}

}
