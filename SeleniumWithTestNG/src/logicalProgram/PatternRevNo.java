package logicalProgram;

import java.util.Scanner;

public class PatternRevNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++)
		{
			for(int j= 0; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
