package logicalProgram;

import java.util.Scanner;

public class armtrongno {
	public static void main(String[] args) {
	//int num1 = 340;
	int sum = 0 ;
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	System.out.println("enter input no. " +num1);
	
			
	for(int i=num1; i>0; i=i/10)
	{
		int rem = i%10;
		sum=sum+(rem*rem*rem);
	}
	if(num1==sum)
	{
		System.out.println("number is armtrong" +num1);
	}
	else
	{
		System.out.println("number is not armtrong  " +sum);
	}
	
	
	
	}
}
