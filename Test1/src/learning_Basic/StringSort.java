package learning_Basic;

import java.util.Scanner;

public class StringSort {
	    public static String Sort(String s1)
	    {
	        char ch[]=s1.toCharArray();         
	        String res=" ";
	        
	        for(int i=0; i<ch.length ; i++)
	        {
	            for(int j=i+1;j<ch.length; j++)
	            {
	                if(ch[i]>=ch[j])
	                {
	                    char m=ch[i];
	                    ch[i]=ch[j];
	                    ch[j]=m;
	                }
	            }
	            
	            res=res+ch[i];
	            
	        }

	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the string");
	        
	        String s1=sc.next();
	        String ans=Sort( s1);
	        
	        System.out.println("after sorting=="+ans);
	    }
	
}
