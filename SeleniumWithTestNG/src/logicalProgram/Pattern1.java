package logicalProgram;
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
public class Pattern1 {
	
	public static void main(String[] args) {
		
		int  star = 1;
		int space = 5;
		for(int i=1; i<=6; i++)
		{
			for(int j =1 ; j<=star; j++)
			{
				System.out.print("* ");
			}
			star++ ;
			System.out.println();		
		}

		
		
	}

}
