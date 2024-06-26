class E2
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
		System.out.println(i/(j+2));
	}
}
}
