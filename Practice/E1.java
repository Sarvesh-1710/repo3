class E1
{
public static void main(String args[])
{
	int i=50;
	int j=0;
 	try
	{
		System.out.println("Division :"+(i/j));
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can't divided by zero");
	}
}
}
