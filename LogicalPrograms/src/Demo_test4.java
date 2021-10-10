import java.util.Scanner;

public class Demo_test4 
{
public static void main(String[] args) 
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of the digits to enter");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the Elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int temp;
for(int i=0;i<(n-1);i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr[j]<arr[j+1])	
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("Sorted  one");

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);	
}
}
}
