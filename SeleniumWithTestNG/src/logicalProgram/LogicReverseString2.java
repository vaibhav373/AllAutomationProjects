package logicalProgram;

public class LogicReverseString2 {
	
	
	public static void main(String[] args) {
		 String org = "malge";
		 String rev="";
		 for(int i=org.length()-1; i>=0;i--)
		 {
			 rev=rev+org.charAt(i);
		 }
		 System.out.println(rev);
		 
		 System.out.println();
		 
		 String org1= "abcddcba";   //pallindrome mns rev and rog string is equal
		 String rev1="";
		 for(int i=org1.length()-1; i>=0; i--)
		 {
			 rev1=rev1+org1.charAt(i);
			 
		 }
		 System.out.println(rev1);
		 System.out.println();
		 if(org1.equals(rev1))
		 {
			 System.out.println("given string is pallindrome");
		 }
		 else
		 {
			 System.out.println("griven string is not pallindrome");
		 }
		 
		
		
	}

}
