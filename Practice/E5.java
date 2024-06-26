import java.util.*;
class display
{
      void show(int age)
	{
		try
		{
			if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Eligeble for voting");
		}
	}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
class E5
{
	public static void main(String args[])
	{
		int age=19;
		display obj=new display();
		obj.show(age);
	}
}

