import java.util.*;
class Password
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Password..");
		String password=sc.next();
		try
			{
			if(password.length()>7)
			    throw new ArithmeticException();
		else
			System.out.println("You Are Logged In..");
		}
		catch(ArithmeticException e)
		{
		System.out.println("Password Length Should Not Exceed 7");
		}
	}
}
