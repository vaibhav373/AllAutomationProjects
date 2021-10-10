import java.util.Scanner;

public class Demo_Test_1 
{
public static void main(String[] args) 
{
Scanner  sc= new Scanner(System.in);
System.out.println("Enter the String to input");
String str=sc.nextLine();
StringBuffer strb= new StringBuffer();
int count=0;
strb.append(str);
strb.reverse();

System.out.println("Reverse String is "+strb);
String stru=str.toLowerCase();
for(int i=0;i<stru.length();i++)
{
	
	char ch=stru.charAt(i);
	if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u')
	{
		count++;
	}
}
System.out.println("Number of vowels "+count);

for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{

System.out.println("It contans "+str.charAt(i)+" at index"+i);	
}
}
}
}
