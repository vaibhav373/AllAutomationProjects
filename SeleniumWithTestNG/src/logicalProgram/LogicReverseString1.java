package logicalProgram;

public class LogicReverseString1 {
	
	
	public static void main(String[] args) {
		
		String org = "hrishikesh";
		String rev ="";
		System.out.println(org.length());
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);//hshekihsirh
			
		}
		
		System.out.println(rev);
	}

}
