
public class AlphabetRhombus
{
	public static void main(String args[])
	{
		int j;
		
		//for loop to print alphabet rhombus
		for(int i = 1; i <=3; i++) 
		{
			/*
			 * FOR LOOP FOR PRINTING SPACES
			 */
			for(j = 1; j <= 5-i; j++) 
					System.out.print(" ");
			
			/*
			 * for loop for printing alphabets 
			 */
			for(j = 1; j <= 2*i-1; j++)
					if(j <= i)
						System.out.print((char)(char)(j+64)+" "); 
					else
						System.out.print((char)(char)(2*i-j+64)+" ");
			/*
			 * line break
			 */
			System.out.println(); 
		}
		
		
		for(int i = 2; i >=1; i--) 
		{
			/*
			 * FOR LOOP FOR PRINTING SPACES
			 */
			for(j = 1; j <= 5-i; j++) 
					System.out.print(" ");
			
			/*
			 * for loop for printing alphabets 
			 */
			for(j = 1; j <= 2*i-1; j++)
					if(j <= i)
						System.out.print((char)(char)(j+64)+" "); 
					else
						System.out.print((char)(char)(2*i-j+64)+" ");
			
			//line break
			System.out.println(); 
		}
	}
		
}


