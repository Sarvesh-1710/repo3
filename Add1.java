import java.util.Scanner;
class Add1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter the first no");
		x=sc.nextInt();
		System.out.println("Enter the second no");
		y=sc.nextInt();
		try
		{
			if(x==0 | y==0)
			throw new ArithmeticException();
		else
			System.out.println("sum="+(x+y));
		}
			catch(ArithmeticException e)
			{
				System.out.println("Plz enter only non zero values...");
			}
		finally
			{
		System.out.println("Exceptions Successfully Handled...");
			}
		}
}		