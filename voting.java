import java.util.*;
class voting
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age=sc.nextInt();
	try
	{
		if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("You Are Eligible To Voting");
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println("You Are Not Eligible To Voting");
	}
}
}