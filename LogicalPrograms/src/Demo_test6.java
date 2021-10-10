import java.util.Scanner;

public class Demo_test6 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String ");
String str=sc.nextLine();

char[] chararr=str.toCharArray();
String strwospace="";
int cnt=0;
for(int i=0;i<chararr.length;i++)
{
	if((chararr[i]!=' ')&& (chararr[i]!='\t'))
	{
		strwospace=strwospace+chararr[i];
	}
}
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
{
	cnt++;
}
}

System.out.println(strwospace);
System.out.println("Count of spaces "+cnt);

}
}
