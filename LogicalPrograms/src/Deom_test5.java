import java.util.Scanner;

public class Deom_test5 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to input");
	String str=sc.nextLine();
	System.out.println("Enter the Charcter to check in the string");
	//String chk=sc.nextLine();
	char ch=sc.next().charAt(0);
	String strl=str.toLowerCase();
	System.out.println(strl);
	int cnt=0;
	char chk=Character.toLowerCase(ch);
	for(int i=0;i<strl.length();i++)
	{
		if(strl.charAt(i)==chk)
		{
			cnt++;
		}
	}
	System.out.println("Occurance of Character "+ch);
	System.out.println(cnt);
	
	}
}
