import java.util.*;
class demo
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		n=sc.nextInt();
		for(i=0;i<n;i++)
			{
				for(j=n-i;j>0;j--)
					{
						System.out.print(" ");
							}
                                                    		for(j=0;j<2*i+1;j++)
									{
										System.out.print("*");
											}
												System.out.println(" ");
													}
											}
									}