import java .util.*;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Rows");
		int n=sc.nextInt();
		int i, j;
                for (i =1; i <=n; i++) 
			{
            		for (j =1; j <= i; j++)
 			{
                	if ((i+j)% 2 == 0) 
			{
                   	 System.out.print( 1+" ");
               		 }
                	else 
			{
			 System.out.print( 0+" ");
               		 }
		}
           	 System.out.println();
        }
    }
}

 
   
        
    

		