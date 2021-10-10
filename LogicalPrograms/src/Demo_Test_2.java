	import java.util.Scanner;
	
	public class Demo_Test_2 {
	public static void main(String[] args) 
	{
	//check prime
	int ch=0;	
	int j=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int p=0,c=0;
	//check for 1
	if(num<=1)
	{
		ch=1;
	}
	while(j<=num/2)
	{
		if(num%j==0)
		{
			ch=1;
			break;
		}
		else 
		{
			j++;
		}
	}
	if(ch==0)
	{
	System.out.println("It is prime");
	p=1;
	}
	else
	{
		System.out.println("Not Prime");
	//System.out.println("You can't Enter the Gate");
	c=1;
	}
	
	if(p==1)
	{
		if(num%2==0)
		{
		System.out.println("It is a even prime number");	
		}
		else 
		{
			System.out.println("It is a odd prime number");		
		}
	
	}
	else 
	{
		System.out.println("You can't enter Gate");}
	
	}
	}
