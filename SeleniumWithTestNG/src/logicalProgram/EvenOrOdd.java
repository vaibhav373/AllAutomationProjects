package logicalProgram;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("enter no: ");
		
		int num1 = num.nextInt();
		if(num1%2==0)
		{
			System.out.println("no. is even");
		}
		else
		{
			System.out.println("no. is odd");
		}
		
		
		int num2 = num.nextInt();
		int num3 = num.nextInt();
		int num4=num2+num3;
		System.out.println("addition is : "+num4);
		
	}

}
