import java .util.*;
class Pattern8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Rows");
		int n=sc.nextInt();
		for (int i =n; i >0; i--) 
			{
            		for (int j =0; j<n-i; j++)
 				{
                		System.out.print( " ");
               			 }
				for ( int j=1; j<=(2*i-1); j++) 
				{
				if(i==n || j==1 || j==(2*i-1))
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
            			 System.out.println( " ");
               		 }
			for (int i =2; i <=n; i++) 
			{
            		for (int j =0; j<n-i; j++)
 			{
                	
			 System.out.print( " ");
               		 }
			for ( int j=1; j<=(2*i-1); j++) 
			{
				if(i==n || j==1 || j==(2*i-1))
				{
					System.out.print("*");
			}
			else
			
			 {
				System.out.print(" ");
			}
		}
            			 System.out.println( " ");
               		 }
		}
	}
		
    


