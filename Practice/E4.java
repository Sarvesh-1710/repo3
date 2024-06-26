import java.util.*;
class E4
{
public static void main(String args[])
{
	String z=null;
 	try
	{
		System.out.println(z.length());
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception Handled");
	}
	finally
	{
		System.out.println("I Excecute Always");
}
}
}
