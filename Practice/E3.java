class E3
{
public static void main(String args[])
{
	int i=34;
	int j=2;
 	try
	{
		System.out.println("Division :"+(i/j));
	}
	catch(ArithmeticException e)
	{
		System.out.println("Second Number Cannot be Zero");
	}
	finally
	{
		System.out.println("I Excecute always");
}
}
}
