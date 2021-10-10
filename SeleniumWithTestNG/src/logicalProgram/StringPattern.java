package logicalProgram;

public class StringPattern {
	
	public static void main(String[] args) {
		
		String org = "malge";
		char a[] = org.toCharArray();
		
		for (int i = 0 ; i<=org.length()-1; i++)
		{
			for(int j= 0; j<=i; j++)
			{
				System.out.print(a[j]);
			}
			
			System.out.println();
		}
	}

}
